package com.example.david.zoneify.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.david.zoneify.data.converters.LatLngConverter.class, com.example.david.zoneify.data.converters.BooleanConverter.class, com.example.david.zoneify.data.converters.DirectionEnumConverter.class})
@androidx.room.Database(entities = {com.example.david.zoneify.data.Zone.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/david/zoneify/data/ZoneifyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "zoneDao", "Lcom/example/david/zoneify/data/ZoneDao;", "Companion", "ZoneifyDatabaseCallback", "app_debug"})
public abstract class ZoneifyDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.david.zoneify.data.ZoneifyDatabase INSTANCE;
    public static final com.example.david.zoneify.data.ZoneifyDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.david.zoneify.data.ZoneDao zoneDao();
    
    public ZoneifyDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0019\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/david/zoneify/data/ZoneifyDatabase$ZoneifyDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "()V", "onOpen", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "populateDatabase", "zoneDao", "Lcom/example/david/zoneify/data/ZoneDao;", "(Lcom/example/david/zoneify/data/ZoneDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    static final class ZoneifyDatabaseCallback extends androidx.room.RoomDatabase.Callback {
        
        @java.lang.Override()
        public void onOpen(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object populateDatabase(@org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.ZoneDao zoneDao, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        public ZoneifyDatabaseCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/david/zoneify/data/ZoneifyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/david/zoneify/data/ZoneifyDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.david.zoneify.data.ZoneifyDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}