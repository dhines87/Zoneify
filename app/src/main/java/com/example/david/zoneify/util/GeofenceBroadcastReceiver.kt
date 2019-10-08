package com.example.david.zoneify.util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class GeofenceBroadcastReceiver : BroadcastReceiver(), CoroutineScope by MainScope() {

    override fun onReceive(context: Context, intent: Intent) {

        val geofencingEvent = GeofencingEvent.fromIntent(intent)
        val geofenceTransition = geofencingEvent.geofenceTransition

        if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_DWELL || geofenceTransition == Geofence.GEOFENCE_TRANSITION_EXIT) {

            val triggeringGeofences = geofencingEvent.triggeringGeofences

            for (triggeredGeofence in triggeringGeofences) {
                launch {
                    sendNotification(triggeredGeofence.requestId.toInt(), context)
                }
            }
        }
    }

    private suspend fun sendNotification(id: Int, context: Context) {
        val zone = RepositoryHelper.provideZonesRepository(context).getZoneById(id)

        if (zone != null) {
            sendNotification(context, zone)
        }
    }

}
