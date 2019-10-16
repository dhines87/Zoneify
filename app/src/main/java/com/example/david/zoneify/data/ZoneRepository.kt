package com.example.david.zoneify.data

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import com.example.david.zoneify.util.GeofenceBroadcastReceiver
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingClient
import com.google.android.gms.location.GeofencingRequest
import com.google.android.gms.location.LocationServices

class ZoneRepository internal constructor(
    private val zoneDao: ZoneDao,
    private val context: Context
) {

    var geofencingClient: GeofencingClient = LocationServices.getGeofencingClient(context)
    private val geofencePendingIntent: PendingIntent by lazy {
        val intent = Intent(context, GeofenceBroadcastReceiver::class.java)
        PendingIntent.getService(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT)
    }

    suspend fun getAllZones(): List<Zone> {
        return zoneDao.getAllZones()
    }

    suspend fun getZoneById(id: Int): Zone? {
        return zoneDao.getZoneById(id)
    }

    suspend fun insertZone(zone: Zone) {
        zoneDao.insertZone(zone)
        addGeofence(zone)
    }

    suspend fun updateZone(zone: Zone): Int {
        addGeofence(zone)
        return zoneDao.updateZone(zone)
    }

    suspend fun deleteZone(id: Int): Int {
        removeGeofence(id.toString())
        return zoneDao.deleteZoneById(id)
    }

    fun addGeofence(zone: Zone) {
        val geofence = buildGeofence(zone)

        if (geofence != null
            && ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            geofencingClient
                .addGeofences(buildGeofencingRequest(geofence, zone.direction), geofencePendingIntent)
        }
    }

    private fun buildGeofence(zone: Zone): Geofence? {
        val transitionType = if (zone.direction == Direction.ENTERING) Geofence.GEOFENCE_TRANSITION_DWELL else Geofence.GEOFENCE_TRANSITION_EXIT

        val geofence = Geofence.Builder()
            .setRequestId(zone.id.toString())
            .setCircularRegion(
                zone.latLng.latitude,
                zone.latLng.longitude,
                zone.radius.toFloat())
            .setTransitionTypes(transitionType)
            .setExpirationDuration(Geofence.NEVER_EXPIRE)

        if (transitionType == Geofence.GEOFENCE_TRANSITION_DWELL) {
            geofence.setLoiteringDelay(60000) // 1 minute
        }

        return geofence
            .build()
    }

    private fun buildGeofencingRequest(geofence: Geofence, direction: Direction): GeofencingRequest {
        val initialTriggerEvent = if (direction == Direction.ENTERING) GeofencingRequest.INITIAL_TRIGGER_DWELL else GeofencingRequest.INITIAL_TRIGGER_ENTER

        return GeofencingRequest.Builder().apply {
            setInitialTrigger(initialTriggerEvent)
            addGeofences(listOf(geofence))
        }.build()
    }

    private fun removeGeofence(id: String) {
        geofencingClient
            .removeGeofences(listOf(id))
    }
}