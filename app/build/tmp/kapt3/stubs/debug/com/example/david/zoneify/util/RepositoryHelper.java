package com.example.david.zoneify.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/david/zoneify/util/RepositoryHelper;", "", "()V", "database", "Lcom/example/david/zoneify/data/ZoneifyDatabase;", "lock", "zoneRepository", "Lcom/example/david/zoneify/data/ZoneRepository;", "getZoneRepository", "()Lcom/example/david/zoneify/data/ZoneRepository;", "setZoneRepository", "(Lcom/example/david/zoneify/data/ZoneRepository;)V", "createZoneRepository", "context", "Landroid/content/Context;", "provideZonesRepository", "app_debug"})
public final class RepositoryHelper {
    private static final java.lang.Object lock = null;
    @org.jetbrains.annotations.Nullable()
    private static volatile com.example.david.zoneify.data.ZoneRepository zoneRepository;
    private static com.example.david.zoneify.data.ZoneifyDatabase database;
    public static final com.example.david.zoneify.util.RepositoryHelper INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.david.zoneify.data.ZoneRepository getZoneRepository() {
        return null;
    }
    
    public final void setZoneRepository(@org.jetbrains.annotations.Nullable()
    com.example.david.zoneify.data.ZoneRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.david.zoneify.data.ZoneRepository provideZonesRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final com.example.david.zoneify.data.ZoneRepository createZoneRepository(android.content.Context context) {
        return null;
    }
    
    private RepositoryHelper() {
        super();
    }
}