package com.example.david.zoneify.data.converters

import androidx.room.TypeConverter
import com.google.android.gms.maps.model.LatLng
import java.util.*

class LatLngConverter {
    @TypeConverter
    fun fromLocation(latLng: LatLng?): String? {
        return if (latLng == null) {
            null
        } else String.format(Locale.US, "%f,%f", latLng.latitude, latLng.longitude)

    }

    @TypeConverter
    fun toLatLng(latLng: String?): LatLng? {
        if (latLng == null) {
            return null
        }

        val latLngs = latLng.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        return LatLng(latLngs[0].toDouble(), latLngs[1].toDouble())
    }
}