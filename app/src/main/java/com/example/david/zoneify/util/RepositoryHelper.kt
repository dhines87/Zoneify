package com.example.david.zoneify.util

import android.app.Activity
import android.content.Context
import com.example.david.zoneify.data.ZoneRepository
import com.example.david.zoneify.data.ZoneifyDatabase

object RepositoryHelper {

    private val lock = Any()
    @Volatile
    var zoneRepository: ZoneRepository? = null
    private var database: ZoneifyDatabase? = null

    fun provideZonesRepository(context: Context): ZoneRepository {
        synchronized(this) {
            return zoneRepository ?: createZoneRepository(context)
        }
    }

    private fun createZoneRepository(context: Context): ZoneRepository {
        val database = database?: ZoneifyDatabase.getDatabase(context.applicationContext)
        val repository = ZoneRepository(database.zoneDao(), context)
        val sharedPreferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
        val databasePopulated = sharedPreferences.getBoolean("DATABASE_POPULATED", false)
        val geofencesAdded = sharedPreferences.getBoolean("GEOFENCES_ADDED", false)

        if (databasePopulated && !geofencesAdded) {
            val zones = database.zoneDao().getAllZones()

            for(zone in zones) {
                repository.addGeofence(zone)
            }

            sharedPreferences
                .edit()
                .putBoolean("GEOFENCES_ADDED", true)
                .apply()
        }

        return ZoneRepository(database.zoneDao(), context)
    }
}