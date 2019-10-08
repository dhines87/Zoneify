package com.example.david.zoneify.zoneView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0006\u0010\u001f\u001a\u00020\u0019J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017J\u0012\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\u0010\u00104\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u00105\u001a\u00020,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00067"}, d2 = {"Lcom/example/david/zoneify/zoneView/ZoneLocationFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;", "()V", "TAG", "", "circle", "Lcom/google/android/gms/maps/model/Circle;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mRoot", "Landroid/view/View;", "zone", "Lcom/example/david/zoneify/data/Zone;", "zoneId", "", "zoneViewModel", "Lcom/example/david/zoneify/zoneView/ZoneViewModel;", "getZoneViewModel", "()Lcom/example/david/zoneify/zoneView/ZoneViewModel;", "zoneViewModel$delegate", "Lkotlin/Lazy;", "addZoneMarkerCircle", "", "bitmapDescriptorFromVector", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "context", "Landroid/content/Context;", "vectorResId", "deleteZone", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMapReady", "googleMap", "onMyLocationButtonClick", "", "onMyLocationClick", "location", "Landroid/location/Location;", "resizeCircle", "radius", "setupListeners", "setupObservers", "toggleRadiusButtons", "updateZone", "Companion", "app_debug"})
public final class ZoneLocationFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener, com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener {
    private final kotlin.Lazy zoneViewModel$delegate = null;
    private com.google.android.gms.maps.GoogleMap mMap;
    private int zoneId;
    private com.example.david.zoneify.data.Zone zone;
    private android.view.View mRoot;
    private final java.lang.String TAG = null;
    private com.google.android.gms.maps.model.Circle circle;
    @org.jetbrains.annotations.Nullable()
    private static com.google.android.gms.maps.SupportMapFragment mapFragment;
    public static final com.example.david.zoneify.zoneView.ZoneLocationFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.david.zoneify.zoneView.ZoneViewModel getZoneViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onMyLocationClick(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public boolean onMyLocationButtonClick() {
        return false;
    }
    
    private final void setupListeners() {
    }
    
    private final void setupObservers() {
    }
    
    private final void resizeCircle(int radius) {
    }
    
    private final void toggleRadiusButtons(com.example.david.zoneify.data.Zone zone) {
    }
    
    private final void addZoneMarkerCircle() {
    }
    
    private final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptorFromVector(android.content.Context context, int vectorResId) {
        return null;
    }
    
    public final boolean updateZone() {
        return false;
    }
    
    public final void deleteZone() {
    }
    
    public ZoneLocationFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/david/zoneify/zoneView/ZoneLocationFragment$Companion;", "", "()V", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "newInstance", "Lcom/example/david/zoneify/zoneView/ZoneLocationFragment;", "id", "", "name", "", "lat", "", "long", "radius", "message", "active", "", "direction", "Lcom/example/david/zoneify/data/Direction;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
            return null;
        }
        
        public final void setMapFragment(@org.jetbrains.annotations.Nullable()
        com.google.android.gms.maps.SupportMapFragment p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.david.zoneify.zoneView.ZoneLocationFragment newInstance(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, double lat, double p3_1663806, int radius, @org.jetbrains.annotations.NotNull()
        java.lang.String message, boolean active, @org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.Direction direction) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}