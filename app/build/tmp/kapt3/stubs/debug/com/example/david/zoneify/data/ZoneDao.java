package com.example.david.zoneify.data;

import java.lang.System;

/**
 * Data Access Object for the zones table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/david/zoneify/data/ZoneDao;", "", "deleteZoneById", "", "zoneId", "getAllZones", "", "Lcom/example/david/zoneify/data/Zone;", "getZoneById", "insertZone", "", "zone", "updateZone", "app_debug"})
public abstract interface ZoneDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM zones_table")
    public abstract java.util.List<com.example.david.zoneify.data.Zone> getAllZones();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM zones_table WHERE id = :zoneId")
    public abstract com.example.david.zoneify.data.Zone getZoneById(int zoneId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertZone(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Zone zone);
    
    @androidx.room.Update()
    public abstract int updateZone(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Zone zone);
    
    @androidx.room.Query(value = "DELETE FROM zones_table WHERE id = :zoneId")
    public abstract int deleteZoneById(int zoneId);
}