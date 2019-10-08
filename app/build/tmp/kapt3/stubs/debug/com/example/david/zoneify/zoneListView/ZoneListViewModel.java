package com.example.david.zoneify.zoneListView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u0014\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/example/david/zoneify/zoneListView/ZoneListViewModel;", "Landroidx/lifecycle/ViewModel;", "zoneRepository", "Lcom/example/david/zoneify/data/ZoneRepository;", "(Lcom/example/david/zoneify/data/ZoneRepository;)V", "selectedZoneId", "Landroidx/lifecycle/MutableLiveData;", "", "getSelectedZoneId", "()Landroidx/lifecycle/MutableLiveData;", "setSelectedZoneId", "(Landroidx/lifecycle/MutableLiveData;)V", "zones", "", "Lcom/example/david/zoneify/data/Zone;", "getZones", "loadZones", "", "openZone", "id", "setZones", "app_debug"})
public final class ZoneListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.david.zoneify.data.Zone>> zones = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> selectedZoneId;
    private final com.example.david.zoneify.data.ZoneRepository zoneRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.david.zoneify.data.Zone>> getZones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedZoneId() {
        return null;
    }
    
    public final void setSelectedZoneId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void loadZones() {
    }
    
    private final void setZones(java.util.List<com.example.david.zoneify.data.Zone> zones) {
    }
    
    public final void openZone(int id) {
    }
    
    public ZoneListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.ZoneRepository zoneRepository) {
        super();
    }
}