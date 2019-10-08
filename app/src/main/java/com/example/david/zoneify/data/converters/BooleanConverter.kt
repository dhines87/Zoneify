package com.example.david.zoneify.data.converters

import androidx.room.TypeConverter

class BooleanConverter {
    @TypeConverter
    fun fromBoolean(bool: Boolean): Int {
        return if (bool) 1 else 0
    }

    @TypeConverter
    fun toBoolean(bool: Int): Boolean {
        return bool == 1
    }
}