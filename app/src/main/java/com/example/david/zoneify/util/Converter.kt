package com.example.david.zoneify.util

import com.google.android.gms.maps.model.LatLng
import java.util.*


object Converter {

    @JvmStatic fun latLngToString(latLng: LatLng): String {
        return String.format(Locale.US, "%f,%f", latLng.latitude, latLng.longitude)
    }
}