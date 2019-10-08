package com.example.david.zoneify.databinding;
import com.example.david.zoneify.R;
import com.example.david.zoneify.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentZoneBindingImpl extends FragmentZoneBinding implements com.example.david.zoneify.generated.callback.OnClickListener.Listener, com.example.david.zoneify.generated.callback.OnCheckedChangeListener.Listener, com.example.david.zoneify.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayoutZoneName, 8);
        sViewsWithIds.put(R.id.editLocationButton, 9);
        sViewsWithIds.put(R.id.textInputLayoutZoneLocation, 10);
        sViewsWithIds.put(R.id.textInputLayoutZoneMessage, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback2;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener activeSwitchandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of zoneViewModel.zone.getValue().active
            //         is zoneViewModel.zone.getValue().setActive((boolean) callbackArg_0)
            boolean callbackArg_0 = activeSwitch.isChecked();
            // localize variables for thread safety
            // zoneViewModel.zone
            androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone> zoneViewModelZone = null;
            // zoneViewModel.zone.getValue()
            com.example.david.zoneify.data.Zone zoneViewModelZoneGetValue = null;
            // zoneViewModel.zone != null
            boolean zoneViewModelZoneJavaLangObjectNull = false;
            // zoneViewModel != null
            boolean zoneViewModelJavaLangObjectNull = false;
            // zoneViewModel.zone.getValue() != null
            boolean zoneViewModelZoneGetValueJavaLangObjectNull = false;
            // zoneViewModel
            com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;
            // zoneViewModel.zone.getValue().active
            boolean zoneViewModelZoneActive = false;



            zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
            if (zoneViewModelJavaLangObjectNull) {


                zoneViewModelZone = zoneViewModel.getZone();

                zoneViewModelZoneJavaLangObjectNull = (zoneViewModelZone) != (null);
                if (zoneViewModelZoneJavaLangObjectNull) {


                    zoneViewModelZoneGetValue = zoneViewModelZone.getValue();

                    zoneViewModelZoneGetValueJavaLangObjectNull = (zoneViewModelZoneGetValue) != (null);
                    if (zoneViewModelZoneGetValueJavaLangObjectNull) {




                        zoneViewModelZoneGetValue.setActive(((boolean) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener textInputEditTextZoneMessageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of zoneViewModel.zone.getValue().message
            //         is zoneViewModel.zone.getValue().setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(textInputEditTextZoneMessage);
            // localize variables for thread safety
            // zoneViewModel.zone.getValue().message
            java.lang.String zoneViewModelZoneMessage = null;
            // zoneViewModel.zone
            androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone> zoneViewModelZone = null;
            // zoneViewModel.zone.getValue()
            com.example.david.zoneify.data.Zone zoneViewModelZoneGetValue = null;
            // zoneViewModel.zone != null
            boolean zoneViewModelZoneJavaLangObjectNull = false;
            // zoneViewModel != null
            boolean zoneViewModelJavaLangObjectNull = false;
            // zoneViewModel.zone.getValue() != null
            boolean zoneViewModelZoneGetValueJavaLangObjectNull = false;
            // zoneViewModel
            com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



            zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
            if (zoneViewModelJavaLangObjectNull) {


                zoneViewModelZone = zoneViewModel.getZone();

                zoneViewModelZoneJavaLangObjectNull = (zoneViewModelZone) != (null);
                if (zoneViewModelZoneJavaLangObjectNull) {


                    zoneViewModelZoneGetValue = zoneViewModelZone.getValue();

                    zoneViewModelZoneGetValueJavaLangObjectNull = (zoneViewModelZoneGetValue) != (null);
                    if (zoneViewModelZoneGetValueJavaLangObjectNull) {




                        zoneViewModelZoneGetValue.setMessage(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener textInputEditTextZoneNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of zoneViewModel.zone.getValue().name
            //         is zoneViewModel.zone.getValue().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(textInputEditTextZoneName);
            // localize variables for thread safety
            // zoneViewModel.zone
            androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone> zoneViewModelZone = null;
            // zoneViewModel.zone.getValue()
            com.example.david.zoneify.data.Zone zoneViewModelZoneGetValue = null;
            // zoneViewModel.zone != null
            boolean zoneViewModelZoneJavaLangObjectNull = false;
            // zoneViewModel != null
            boolean zoneViewModelJavaLangObjectNull = false;
            // zoneViewModel.zone.getValue() != null
            boolean zoneViewModelZoneGetValueJavaLangObjectNull = false;
            // zoneViewModel.zone.getValue().name
            java.lang.String zoneViewModelZoneName = null;
            // zoneViewModel
            com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



            zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
            if (zoneViewModelJavaLangObjectNull) {


                zoneViewModelZone = zoneViewModel.getZone();

                zoneViewModelZoneJavaLangObjectNull = (zoneViewModelZone) != (null);
                if (zoneViewModelZoneJavaLangObjectNull) {


                    zoneViewModelZoneGetValue = zoneViewModelZone.getValue();

                    zoneViewModelZoneGetValueJavaLangObjectNull = (zoneViewModelZoneGetValue) != (null);
                    if (zoneViewModelZoneGetValueJavaLangObjectNull) {




                        zoneViewModelZoneGetValue.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentZoneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentZoneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.SwitchCompat) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (android.widget.ImageView) bindings[2]
            );
        this.activeSwitch.setTag(null);
        this.activeSwitchText.setTag(null);
        this.enteringButton.setTag(null);
        this.leavingButton.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textInputEditTextZoneMessage.setTag(null);
        this.textInputEditTextZoneName.setTag(null);
        this.zoneEditActiveImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.david.zoneify.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.david.zoneify.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback5 = new com.example.david.zoneify.generated.callback.AfterTextChanged(this, 5);
        mCallback3 = new com.example.david.zoneify.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.david.zoneify.generated.callback.AfterTextChanged(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.zoneViewModel == variableId) {
            setZoneViewModel((com.example.david.zoneify.zoneView.ZoneViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setZoneViewModel(@Nullable com.example.david.zoneify.zoneView.ZoneViewModel ZoneViewModel) {
        this.mZoneViewModel = ZoneViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.zoneViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeZoneViewModelActiveText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeZoneViewModelActiveImageResource((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeZoneViewModelZone((androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeZoneViewModelActiveText(androidx.lifecycle.LiveData<java.lang.String> ZoneViewModelActiveText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeZoneViewModelActiveImageResource(androidx.lifecycle.LiveData<java.lang.Integer> ZoneViewModelActiveImageResource, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeZoneViewModelZone(androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone> ZoneViewModelZone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String zoneViewModelZoneName = null;
        boolean zoneViewModelZoneActive = false;
        androidx.lifecycle.LiveData<java.lang.String> zoneViewModelActiveText = null;
        com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;
        java.lang.Integer zoneViewModelActiveImageResourceGetValue = null;
        java.lang.String zoneViewModelZoneMessage = null;
        androidx.lifecycle.LiveData<java.lang.Integer> zoneViewModelActiveImageResource = null;
        com.example.david.zoneify.data.Zone zoneViewModelZoneGetValue = null;
        java.lang.String zoneViewModelActiveTextGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxZoneViewModelActiveImageResourceGetValue = 0;
        androidx.lifecycle.MutableLiveData<com.example.david.zoneify.data.Zone> zoneViewModelZone = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (zoneViewModel != null) {
                        // read zoneViewModel.activeText
                        zoneViewModelActiveText = zoneViewModel.getActiveText();
                    }
                    updateLiveDataRegistration(0, zoneViewModelActiveText);


                    if (zoneViewModelActiveText != null) {
                        // read zoneViewModel.activeText.getValue()
                        zoneViewModelActiveTextGetValue = zoneViewModelActiveText.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (zoneViewModel != null) {
                        // read zoneViewModel.activeImageResource
                        zoneViewModelActiveImageResource = zoneViewModel.getActiveImageResource();
                    }
                    updateLiveDataRegistration(1, zoneViewModelActiveImageResource);


                    if (zoneViewModelActiveImageResource != null) {
                        // read zoneViewModel.activeImageResource.getValue()
                        zoneViewModelActiveImageResourceGetValue = zoneViewModelActiveImageResource.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(zoneViewModel.activeImageResource.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxZoneViewModelActiveImageResourceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(zoneViewModelActiveImageResourceGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (zoneViewModel != null) {
                        // read zoneViewModel.zone
                        zoneViewModelZone = zoneViewModel.getZone();
                    }
                    updateLiveDataRegistration(2, zoneViewModelZone);


                    if (zoneViewModelZone != null) {
                        // read zoneViewModel.zone.getValue()
                        zoneViewModelZoneGetValue = zoneViewModelZone.getValue();
                    }


                    if (zoneViewModelZoneGetValue != null) {
                        // read zoneViewModel.zone.getValue().name
                        zoneViewModelZoneName = zoneViewModelZoneGetValue.getName();
                        // read zoneViewModel.zone.getValue().active
                        zoneViewModelZoneActive = zoneViewModelZoneGetValue.getActive();
                        // read zoneViewModel.zone.getValue().message
                        zoneViewModelZoneMessage = zoneViewModelZoneGetValue.getMessage();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.activeSwitch, zoneViewModelZoneActive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textInputEditTextZoneMessage, zoneViewModelZoneMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textInputEditTextZoneName, zoneViewModelZoneName);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.activeSwitch, mCallback2, activeSwitchandroidCheckedAttrChanged);
            this.enteringButton.setOnClickListener(mCallback3);
            this.leavingButton.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textInputEditTextZoneMessage, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback5, textInputEditTextZoneMessageandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textInputEditTextZoneName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback1, textInputEditTextZoneNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activeSwitchText, zoneViewModelActiveTextGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.zoneEditActiveImage.setImageResource(androidxDatabindingViewDataBindingSafeUnboxZoneViewModelActiveImageResourceGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // zoneViewModel != null
                boolean zoneViewModelJavaLangObjectNull = false;
                // zoneViewModel
                com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



                zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
                if (zoneViewModelJavaLangObjectNull) {


                    zoneViewModel.toggleDirection();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // zoneViewModel != null
                boolean zoneViewModelJavaLangObjectNull = false;
                // zoneViewModel
                com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



                zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
                if (zoneViewModelJavaLangObjectNull) {


                    zoneViewModel.toggleDirection();
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // zoneViewModel != null
        boolean zoneViewModelJavaLangObjectNull = false;
        // zoneViewModel
        com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



        zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
        if (zoneViewModelJavaLangObjectNull) {


            zoneViewModel.activeOnCheckedChanged();
        }
    }
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // zoneViewModel != null
                boolean zoneViewModelJavaLangObjectNull = false;
                // zoneViewModel
                com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



                zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
                if (zoneViewModelJavaLangObjectNull) {


                    zoneViewModel.validateMessage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // zoneViewModel != null
                boolean zoneViewModelJavaLangObjectNull = false;
                // zoneViewModel
                com.example.david.zoneify.zoneView.ZoneViewModel zoneViewModel = mZoneViewModel;



                zoneViewModelJavaLangObjectNull = (zoneViewModel) != (null);
                if (zoneViewModelJavaLangObjectNull) {


                    zoneViewModel.validateName();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): zoneViewModel.activeText
        flag 1 (0x2L): zoneViewModel.activeImageResource
        flag 2 (0x3L): zoneViewModel.zone
        flag 3 (0x4L): zoneViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}