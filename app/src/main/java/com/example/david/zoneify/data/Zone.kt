package com.example.david.zoneify.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.gms.maps.model.LatLng

@Entity(tableName = "zones_table")
data class Zone (
    var name: String,
    var latLng: LatLng,
    var radius: Int,
    var direction: Direction,
    var message: String,
    var active: Boolean = true
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}