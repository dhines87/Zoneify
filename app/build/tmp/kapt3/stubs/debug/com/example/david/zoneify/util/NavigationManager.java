package com.example.david.zoneify.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\nJF\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/david/zoneify/util/NavigationManager;", "", "()V", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "mNavigationListener", "Lcom/example/david/zoneify/util/NavigationManager$NavigationListener;", "getVisibleFragment", "Landroidx/fragment/app/Fragment;", "init", "", "fragmentManager", "navigateBack", "baseActivity", "Landroid/app/Activity;", "navigateBackToRoot", "open", "fragment", "openAsRoot", "popEveryFragment", "startZoneFragment", "id", "", "startZoneListFragment", "startZoneLocationFragment", "name", "", "lat", "", "long", "radius", "message", "active", "", "direction", "Lcom/example/david/zoneify/data/Direction;", "Companion", "NavigationListener", "app_debug"})
public final class NavigationManager {
    private androidx.fragment.app.FragmentManager mFragmentManager;
    private com.example.david.zoneify.util.NavigationManager.NavigationListener mNavigationListener;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.david.zoneify.util.NavigationManager instance = null;
    public static final com.example.david.zoneify.util.NavigationManager.Companion Companion = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    private final void open(androidx.fragment.app.Fragment fragment) {
    }
    
    private final void openAsRoot(androidx.fragment.app.Fragment fragment) {
    }
    
    private final void popEveryFragment() {
    }
    
    public final void navigateBack(@org.jetbrains.annotations.NotNull()
    android.app.Activity baseActivity) {
    }
    
    public final void navigateBackToRoot() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getVisibleFragment() {
        return null;
    }
    
    public final void startZoneListFragment() {
    }
    
    public final void startZoneFragment(int id) {
    }
    
    public final void startZoneLocationFragment(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double lat, double p3_1663806, int radius, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean active, @org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.data.Direction direction) {
    }
    
    public NavigationManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/david/zoneify/util/NavigationManager$NavigationListener;", "", "onBackstackChanged", "", "app_debug"})
    public static abstract interface NavigationListener {
        
        public abstract void onBackstackChanged();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/david/zoneify/util/NavigationManager$Companion;", "", "()V", "instance", "Lcom/example/david/zoneify/util/NavigationManager;", "getInstance", "()Lcom/example/david/zoneify/util/NavigationManager;", "newInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.david.zoneify.util.NavigationManager getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.david.zoneify.util.NavigationManager newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}