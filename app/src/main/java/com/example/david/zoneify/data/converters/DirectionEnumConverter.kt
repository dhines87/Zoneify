package com.example.david.zoneify.data.converters

import androidx.room.TypeConverter
import com.example.david.zoneify.data.Direction

class DirectionEnumConverter {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun <T : Enum<T>> T.toInt(): Int = this.ordinal
    private inline fun <reified T : Enum<T>> Int.toEnum(): T = enumValues<T>()[this]

    @TypeConverter
    fun enumDirectionToTnt(value: Direction) = value.toInt()
    @TypeConverter
    fun intToEnumDirection(value: Int) = value.toEnum<Direction>()
}
