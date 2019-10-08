package com.example.david.zoneify.data.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J$\u0010\b\u001a\u0002H\t\"\u0010\b\u0000\u0010\t\u0018\u0001*\b\u0012\u0004\u0012\u0002H\t0\n*\u00020\u0004H\u0082\b\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u00020\u0004\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n*\u0002H\tH\u0082\b\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/david/zoneify/data/converters/DirectionEnumConverter;", "", "()V", "enumDirectionToTnt", "", "value", "Lcom/example/david/zoneify/data/Direction;", "intToEnumDirection", "toEnum", "T", "", "(I)Ljava/lang/Enum;", "toInt", "(Ljava/lang/Enum;)I", "app_debug"})
public final class DirectionEnumConverter {
    
    @kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
    private final <T extends java.lang.Enum<T>>int toInt(@org.jetbrains.annotations.NotNull()
    T $this$toInt) {
        return 0;
    }
    
    @androidx.room.TypeConverter()
    public final int enumDirectionToTnt(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Direction value) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.example.david.zoneify.data.Direction intToEnumDirection(int value) {
        return null;
    }
    
    public DirectionEnumConverter() {
        super();
    }
}