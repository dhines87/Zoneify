package com.example.david.zoneify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.david.zoneify.zoneListView.ZoneListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentZoneListBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout zoneListFrameLayout;

  @NonNull
  public final RecyclerView zoneListRecyclerView;

  @Bindable
  protected ZoneListViewModel mZoneListViewModel;

  protected FragmentZoneListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout zoneListFrameLayout, RecyclerView zoneListRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.zoneListFrameLayout = zoneListFrameLayout;
    this.zoneListRecyclerView = zoneListRecyclerView;
  }

  public abstract void setZoneListViewModel(@Nullable ZoneListViewModel zoneListViewModel);

  @Nullable
  public ZoneListViewModel getZoneListViewModel() {
    return mZoneListViewModel;
  }

  @NonNull
  public static FragmentZoneListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_zone_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentZoneListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentZoneListBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.fragment_zone_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentZoneListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_zone_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentZoneListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentZoneListBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.fragment_zone_list, null, false, component);
  }

  public static FragmentZoneListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentZoneListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentZoneListBinding)bind(component, view, com.example.david.zoneify.R.layout.fragment_zone_list);
  }
}
