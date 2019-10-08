package com.example.david.zoneify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.david.zoneify.zoneView.ZoneViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentZoneBinding extends ViewDataBinding {
  @NonNull
  public final SwitchCompat activeSwitch;

  @NonNull
  public final TextView activeSwitchText;

  @NonNull
  public final MaterialButton editLocationButton;

  @NonNull
  public final MaterialButton enteringButton;

  @NonNull
  public final MaterialButton leavingButton;

  @NonNull
  public final TextInputEditText textInputEditTextZoneMessage;

  @NonNull
  public final TextInputEditText textInputEditTextZoneName;

  @NonNull
  public final TextInputLayout textInputLayoutZoneLocation;

  @NonNull
  public final TextInputLayout textInputLayoutZoneMessage;

  @NonNull
  public final TextInputLayout textInputLayoutZoneName;

  @NonNull
  public final ImageView zoneEditActiveImage;

  @Bindable
  protected ZoneViewModel mZoneViewModel;

  protected FragmentZoneBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SwitchCompat activeSwitch, TextView activeSwitchText, MaterialButton editLocationButton,
      MaterialButton enteringButton, MaterialButton leavingButton,
      TextInputEditText textInputEditTextZoneMessage, TextInputEditText textInputEditTextZoneName,
      TextInputLayout textInputLayoutZoneLocation, TextInputLayout textInputLayoutZoneMessage,
      TextInputLayout textInputLayoutZoneName, ImageView zoneEditActiveImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activeSwitch = activeSwitch;
    this.activeSwitchText = activeSwitchText;
    this.editLocationButton = editLocationButton;
    this.enteringButton = enteringButton;
    this.leavingButton = leavingButton;
    this.textInputEditTextZoneMessage = textInputEditTextZoneMessage;
    this.textInputEditTextZoneName = textInputEditTextZoneName;
    this.textInputLayoutZoneLocation = textInputLayoutZoneLocation;
    this.textInputLayoutZoneMessage = textInputLayoutZoneMessage;
    this.textInputLayoutZoneName = textInputLayoutZoneName;
    this.zoneEditActiveImage = zoneEditActiveImage;
  }

  public abstract void setZoneViewModel(@Nullable ZoneViewModel zoneViewModel);

  @Nullable
  public ZoneViewModel getZoneViewModel() {
    return mZoneViewModel;
  }

  @NonNull
  public static FragmentZoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_zone, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentZoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentZoneBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.fragment_zone, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentZoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_zone, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentZoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentZoneBinding>inflateInternal(inflater, com.example.david.zoneify.R.layout.fragment_zone, null, false, component);
  }

  public static FragmentZoneBinding bind(@NonNull View view) {
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
  public static FragmentZoneBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentZoneBinding)bind(component, view, com.example.david.zoneify.R.layout.fragment_zone);
  }
}
