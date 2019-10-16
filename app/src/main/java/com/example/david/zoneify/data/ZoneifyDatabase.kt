package com.example.david.zoneify.data

import android.app.Activity
import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.david.zoneify.data.converters.BooleanConverter
import com.example.david.zoneify.data.converters.DirectionEnumConverter
import com.example.david.zoneify.data.converters.LatLngConverter
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.*

@Database(entities = [Zone::class], version = 1, exportSchema = false)
@TypeConverters(LatLngConverter::class, BooleanConverter::class, DirectionEnumConverter::class)
abstract class ZoneifyDatabase internal constructor(): RoomDatabase() {

    abstract fun zoneDao(): ZoneDao

    companion object {
        @Volatile
        private var INSTANCE: ZoneifyDatabase? = null

        fun getDatabase(context: Context): ZoneifyDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room
                    .databaseBuilder(context.applicationContext, ZoneifyDatabase::class.java,"zoneifyDB")
                    .allowMainThreadQueries()
                    .addCallback(ZoneifyDatabaseCallback(context))
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

    private class ZoneifyDatabaseCallback(private val context: Context) : RoomDatabase.Callback() {

        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { database ->
                GlobalScope.launch (Dispatchers.IO){
                    val zones = database.zoneDao().getAllZones()
                    if (zones.isEmpty()) {
                        populateDatabase(context, database.zoneDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(context: Context, zoneDao: ZoneDao)  {
            var zone = Zone(name = "Home",
                latLng = LatLng(51.032039, -114.100033),
                radius = 100,
                direction = Direction.LEAVING,
                message = "Grab keys.")
            zoneDao.insertZone(zone)
            zone = Zone(name = "Work",
                latLng = LatLng(51.009881, -114.126915),
                radius = 150,
                direction = Direction.ENTERING,
                message = "Finish that report.",
                active = false)
            zoneDao.insertZone(zone)
            zone = Zone(name = "Gym",
                latLng = LatLng(51.038280, -114.081451),
                radius = 150,
                direction = Direction.LEAVING,
                message = "Leaving the gym.")
            zoneDao.insertZone(zone)

            val sharedPreferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
            sharedPreferences
                .edit()
                .putBoolean("DATABASE_POPULATED", true)
                .apply()
        }

    }
}