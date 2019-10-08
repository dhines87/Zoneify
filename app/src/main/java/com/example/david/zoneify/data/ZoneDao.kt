package com.example.david.zoneify.data

import androidx.room.*

/**
 * Data Access Object for the zones table.
 */
@Dao
interface ZoneDao {

    @Query("SELECT * FROM zones_table")
    fun getAllZones(): List<Zone>

    @Query("SELECT * FROM zones_table WHERE id = :zoneId")
    fun getZoneById(zoneId: Int): Zone

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertZone(zone: Zone)

    @Update
    fun updateZone(zone: Zone): Int

    @Query("DELETE FROM zones_table WHERE id = :zoneId")
    fun deleteZoneById(zoneId: Int): Int
}