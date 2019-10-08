package com.example.david.zoneify.util

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
        return ZoneRepository(database.zoneDao(), context)
    }
}