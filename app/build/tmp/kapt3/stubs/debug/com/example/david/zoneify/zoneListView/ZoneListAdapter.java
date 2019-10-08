package com.example.david.zoneify.zoneListView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/david/zoneify/zoneListView/ZoneListAdapter;", "Lcom/example/david/zoneify/zoneListView/DataBindingAdapter;", "Lcom/example/david/zoneify/data/Zone;", "zoneListViewModel", "Lcom/example/david/zoneify/zoneListView/ZoneListViewModel;", "(Lcom/example/david/zoneify/zoneListView/ZoneListViewModel;)V", "getItemViewType", "", "position", "DiffCallback", "app_debug"})
public final class ZoneListAdapter extends com.example.david.zoneify.zoneListView.DataBindingAdapter<com.example.david.zoneify.data.Zone> {
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public ZoneListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.zoneListView.ZoneListViewModel zoneListViewModel) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/david/zoneify/zoneListView/ZoneListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/david/zoneify/data/Zone;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.david.zoneify.data.Zone> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.Zone oldItem, @org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.Zone newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.Zone oldItem, @org.jetbrains.annotations.NotNull()
        com.example.david.zoneify.data.Zone newItem) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
}