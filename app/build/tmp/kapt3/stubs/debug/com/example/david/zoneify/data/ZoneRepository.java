package com.example.david.zoneify.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001b\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010 \u001a\u00020)H\u0002J\u0019\u0010*\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/example/david/zoneify/data/ZoneRepository;", "", "zoneDao", "Lcom/example/david/zoneify/data/ZoneDao;", "context", "Landroid/content/Context;", "(Lcom/example/david/zoneify/data/ZoneDao;Landroid/content/Context;)V", "geofencePendingIntent", "Landroid/app/PendingIntent;", "getGeofencePendingIntent", "()Landroid/app/PendingIntent;", "geofencePendingIntent$delegate", "Lkotlin/Lazy;", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "getGeofencingClient", "()Lcom/google/android/gms/location/GeofencingClient;", "setGeofencingClient", "(Lcom/google/android/gms/location/GeofencingClient;)V", "addGeofence", "", "zone", "Lcom/example/david/zoneify/data/Zone;", "buildGeofence", "Lcom/google/android/gms/location/Geofence;", "buildGeofencingRequest", "Lcom/google/android/gms/location/GeofencingRequest;", "geofence", "direction", "Lcom/example/david/zoneify/data/Direction;", "deleteZone", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllZones", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getZoneById", "insertZone", "(Lcom/example/david/zoneify/data/Zone;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeGeofence", "", "updateZone", "app_debug"})
public final class ZoneRepository {
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    private final kotlin.Lazy geofencePendingIntent$delegate = null;
    private final com.example.david.zoneify.data.ZoneDao zoneDao = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.GeofencingClient getGeofencingClient() {
        return null;
    }
    
    public final void setGeofencingClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.GeofencingClient p0) {
    }
    
    private final android.app.PendingIntent getGeofencePendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllZones(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.david.zoneify.data.Zone>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getZoneById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.david.zoneify.data.Zone> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertZone(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Zone zone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateZone(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Zone zone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteZone(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    private final void addGeofence(com.example.david.zoneify.data.Zone zone) {
    }
    
    private final com.google.android.gms.location.Geofence buildGeofence(com.example.david.zoneify.data.Zone zone) {
        return null;
    }
    
    private final com.google.android.gms.location.GeofencingRequest buildGeofencingRequest(com.google.android.gms.location.Geofence geofence, com.example.david.zoneify.data.Direction direction) {
        return null;
    }
    
    private final void removeGeofence(java.lang.String id) {
    }
    
    public ZoneRepository(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.ZoneDao zoneDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}