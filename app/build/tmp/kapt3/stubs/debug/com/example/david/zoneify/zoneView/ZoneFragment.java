package com.example.david.zoneify.zoneView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006+"}, d2 = {"Lcom/example/david/zoneify/zoneView/ZoneFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "binding", "Lcom/example/david/zoneify/databinding/FragmentZoneBinding;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "zoneId", "", "zoneViewModel", "Lcom/example/david/zoneify/zoneView/ZoneViewModel;", "getZoneViewModel", "()Lcom/example/david/zoneify/zoneView/ZoneViewModel;", "zoneViewModel$delegate", "Lkotlin/Lazy;", "deleteZone", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "setTitle", "zone", "Lcom/example/david/zoneify/data/Zone;", "setupObservers", "toggleDirectionButtons", "direction", "Lcom/example/david/zoneify/data/Direction;", "updateZone", "", "Companion", "app_debug"})
public final class ZoneFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy zoneViewModel$delegate = null;
    private com.example.david.zoneify.databinding.FragmentZoneBinding binding;
    private int zoneId;
    private final java.lang.String TAG = null;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    public static final com.example.david.zoneify.zoneView.ZoneFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.david.zoneify.zoneView.ZoneViewModel getZoneViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void setTitle(com.example.david.zoneify.data.Zone zone) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupObservers() {
    }
    
    private final void toggleDirectionButtons(com.example.david.zoneify.data.Direction direction) {
    }
    
    public final boolean updateZone() {
        return false;
    }
    
    public final void deleteZone() {
    }
    
    public ZoneFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/david/zoneify/zoneView/ZoneFragment$Companion;", "", "()V", "newInstance", "Lcom/example/david/zoneify/zoneView/ZoneFragment;", "id", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.david.zoneify.zoneView.ZoneFragment newInstance(int id) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}