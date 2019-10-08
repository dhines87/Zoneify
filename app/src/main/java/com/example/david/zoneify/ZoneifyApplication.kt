package com.example.david.zoneify

import android.app.Application
import com.example.david.zoneify.data.ZoneRepository
import com.example.david.zoneify.util.RepositoryHelper

class ZoneifyApplication : Application() {

    // Depends on the flavor,
    val zoneRepository: ZoneRepository
        get() = RepositoryHelper.provideZonesRepository(this)

    override fun onCreate() {
        super.onCreate()
    }
}
