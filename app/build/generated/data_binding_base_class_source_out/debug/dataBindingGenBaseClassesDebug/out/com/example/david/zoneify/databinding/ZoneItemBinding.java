package com.example.david.zoneify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.david.zoneify.data.Zone;
import com.example.david.zoneify.zoneListView.ZoneListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ZoneItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView zoneActiveImage;

  @NonNull
  public final TextView zoneActiveText;

  @NonNull
  public final CardView zoneCard;

  @NonNull
  public final ImageView zoneDirection;

  @NonNull
  public final TextView zoneLatLng;

  @NonNull
  public final TextView zoneName;

  @Bindable
  protected Zone mZone;

  @Bindable
  protected ZoneListViewModel mZoneListViewModel;

  protected ZoneItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView zoneActiveImage, TextView zoneActiveText, CardView zoneCard,
      ImageView zoneDirection, TextView zoneLatLng, TextView zoneName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.zoneActiveImage = zoneActiveImage;
    this.zoneActiveText = zoneActiveText;
    this.zoneCard = zoneCard;
    this.zoneDirection = zoneDirection;
    this.zoneLatLng = zoneLatLng;
    this.zoneName = zoneName;
  }

  public abstract void setZone(@Nullable Zone zone);

  @Nullable
  public Zone getZone() {
    return mZone;
  }

  public abstract void setZoneListViewModel(@Nullable ZoneListViewModel zoneListViewModel);

  @Nullable
  public ZoneListViewModel getZoneListViewModel() {
    return mZoneListViewModel;
  }

  @NonNull
  public static ZoneItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.zone_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ZoneItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ZoneItemBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.zone_item, root, attachToRoot, component);
  }

  @NonNull
  public static ZoneItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.zone_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ZoneItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ZoneItemBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.zone_item, null, false, component);
  }

  public static ZoneItemBinding bind(@NonNull View view) {
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
  public static ZoneItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ZoneItemBinding)bind(component, view, com.example.david.zoneify.R.layout.zone_item);
  }
}
