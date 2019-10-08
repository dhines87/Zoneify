package com.example.david.zoneify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J-\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016\u00a2\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/example/david/zoneify/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;", "()V", "PERMISSION_REQUEST_LOCATION", "", "hideMenuItems", "", "navigationManager", "Lcom/example/david/zoneify/util/NavigationManager;", "getNavigationManager", "()Lcom/example/david/zoneify/util/NavigationManager;", "setNavigationManager", "(Lcom/example/david/zoneify/util/NavigationManager;)V", "checkPermission", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setViewToolbar", "fragmentView", "Lcom/example/david/zoneify/util/FragmentViewEnum;", "title", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback {
    @org.jetbrains.annotations.NotNull()
    public com.example.david.zoneify.util.NavigationManager navigationManager;
    private boolean hideMenuItems;
    private final int PERMISSION_REQUEST_LOCATION = 329;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.david.zoneify.util.NavigationManager getNavigationManager() {
        return null;
    }
    
    public final void setNavigationManager(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.util.NavigationManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void setViewToolbar(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.util.FragmentViewEnum fragmentView, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}