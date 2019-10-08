package com.example.david.zoneify.databinding;
import com.example.david.zoneify.R;
import com.example.david.zoneify.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ZoneItemBindingImpl extends ZoneItemBinding implements com.example.david.zoneify.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ZoneItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ZoneItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.zoneActiveImage.setTag(null);
        this.zoneActiveText.setTag(null);
        this.zoneCard.setTag(null);
        this.zoneDirection.setTag(null);
        this.zoneLatLng.setTag(null);
        this.zoneName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.david.zoneify.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.zone == variableId) {
            setZone((com.example.david.zoneify.data.Zone) variable);
        }
        else if (BR.zoneListViewModel == variableId) {
            setZoneListViewModel((com.example.david.zoneify.zoneListView.ZoneListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setZone(@Nullable com.example.david.zoneify.data.Zone Zone) {
        this.mZone = Zone;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.zone);
        super.requestRebind();
    }
    public void setZoneListViewModel(@Nullable com.example.david.zoneify.zoneListView.ZoneListViewModel ZoneListViewModel) {
        this.mZoneListViewModel = ZoneListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.zoneListViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean zoneDirectionDirectionENTERING = false;
        com.example.david.zoneify.data.Direction ZoneDirection1 = null;
        com.example.david.zoneify.data.Zone zone = mZone;
        java.lang.String ZoneName1 = null;
        java.lang.String converterLatLngToStringZoneLatLng = null;
        com.google.android.gms.maps.model.LatLng ZoneLatLng1 = null;
        boolean zoneActive = false;
        java.lang.String zoneActiveZoneActiveTextAndroidStringZoneActiveZoneActiveTextAndroidStringZoneInactive = null;
        android.graphics.drawable.Drawable zoneActiveZoneActiveImageAndroidDrawableZoneOnCardZoneActiveImageAndroidDrawableZoneOffCard = null;
        com.example.david.zoneify.zoneListView.ZoneListViewModel zoneListViewModel = mZoneListViewModel;
        android.graphics.drawable.Drawable zoneDirectionDirectionENTERINGZoneDirectionAndroidDrawableZoneEntering48ZoneDirectionAndroidDrawableZoneLeaving48 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (zone != null) {
                    // read zone.direction
                    ZoneDirection1 = zone.getDirection();
                    // read zone.name
                    ZoneName1 = zone.getName();
                    // read zone.latLng
                    ZoneLatLng1 = zone.getLatLng();
                    // read zone.active
                    zoneActive = zone.getActive();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(zoneActive) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read zone.direction == Direction.ENTERING
                zoneDirectionDirectionENTERING = (ZoneDirection1) == (com.example.david.zoneify.data.Direction.ENTERING);
                // read Converter.latLngToString(zone.latLng)
                converterLatLngToStringZoneLatLng = com.example.david.zoneify.util.Converter.latLngToString(ZoneLatLng1);
                // read zone.active ? @android:string/zone_active : @android:string/zone_inactive
                zoneActiveZoneActiveTextAndroidStringZoneActiveZoneActiveTextAndroidStringZoneInactive = ((zoneActive) ? (zoneActiveText.getResources().getString(R.string.zone_active)) : (zoneActiveText.getResources().getString(R.string.zone_inactive)));
                // read zone.active ? @android:drawable/zone_on_card : @android:drawable/zone_off_card
                zoneActiveZoneActiveImageAndroidDrawableZoneOnCardZoneActiveImageAndroidDrawableZoneOffCard = ((zoneActive) ? (getDrawableFromResource(zoneActiveImage, R.drawable.zone_on_card)) : (getDrawableFromResource(zoneActiveImage, R.drawable.zone_off_card)));
            if((dirtyFlags & 0x5L) != 0) {
                if(zoneDirectionDirectionENTERING) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read zone.direction == Direction.ENTERING ? @android:drawable/zone_entering_48 : @android:drawable/zone_leaving_48
                zoneDirectionDirectionENTERINGZoneDirectionAndroidDrawableZoneEntering48ZoneDirectionAndroidDrawableZoneLeaving48 = ((zoneDirectionDirectionENTERING) ? (getDrawableFromResource(zoneDirection, R.drawable.zone_entering_48)) : (getDrawableFromResource(zoneDirection, R.drawable.zone_leaving_48)));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.zoneActiveImage, zoneActiveZoneActiveImageAndroidDrawableZoneOnCardZoneActiveImageAndroidDrawableZoneOffCard);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.zoneActiveText, zoneActiveZoneActiveTextAndroidStringZoneActiveZoneActiveTextAndroidStringZoneInactive);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.zoneDirection, zoneDirectionDirectionENTERINGZoneDirectionAndroidDrawableZoneEntering48ZoneDirectionAndroidDrawableZoneLeaving48);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.zoneLatLng, converterLatLngToStringZoneLatLng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.zoneName, ZoneName1);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.zoneCard.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // zone != null
        boolean zoneJavaLangObjectNull = false;
        // zone
        com.example.david.zoneify.data.Zone zone = mZone;
        // zoneListViewModel
        com.example.david.zoneify.zoneListView.ZoneListViewModel zoneListViewModel = mZoneListViewModel;
        // zone.id
        int zoneId = 0;
        // zoneListViewModel != null
        boolean zoneListViewModelJavaLangObjectNull = false;



        zoneListViewModelJavaLangObjectNull = (zoneListViewModel) != (null);
        if (zoneListViewModelJavaLangObjectNull) {



            zoneJavaLangObjectNull = (zone) != (null);
            if (zoneJavaLangObjectNull) {


                zoneId = zone.getId();

                zoneListViewModel.openZone(zoneId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): zone
        flag 1 (0x2L): zoneListViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): zone.active ? @android:string/zone_active : @android:string/zone_inactive
        flag 4 (0x5L): zone.active ? @android:string/zone_active : @android:string/zone_inactive
        flag 5 (0x6L): zone.active ? @android:drawable/zone_on_card : @android:drawable/zone_off_card
        flag 6 (0x7L): zone.active ? @android:drawable/zone_on_card : @android:drawable/zone_off_card
        flag 7 (0x8L): zone.direction == Direction.ENTERING ? @android:drawable/zone_entering_48 : @android:drawable/zone_leaving_48
        flag 8 (0x9L): zone.direction == Direction.ENTERING ? @android:drawable/zone_entering_48 : @android:drawable/zone_leaving_48
    flag mapping end*/
    //end
}