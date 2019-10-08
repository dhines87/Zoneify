package com.example.david.zoneify.zoneListView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/david/zoneify/zoneListView/DataBindingAdapter;", "T", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/david/zoneify/zoneListView/DataBindingViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "zoneListViewModel", "Lcom/example/david/zoneify/zoneListView/ZoneListViewModel;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lcom/example/david/zoneify/zoneListView/ZoneListViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public abstract class DataBindingAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.ListAdapter<T, com.example.david.zoneify.zoneListView.DataBindingViewHolder<T>> {
    private final com.example.david.zoneify.zoneListView.ZoneListViewModel zoneListViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.david.zoneify.zoneListView.DataBindingViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.zoneListView.DataBindingViewHolder<T> holder, int position) {
    }
    
    public DataBindingAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback, @org.jetbrains.annotations.NotNull()
    com.example.david.zoneify.zoneListView.ZoneListViewModel zoneListViewModel) {
        super(null);
    }
}