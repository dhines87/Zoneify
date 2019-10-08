package com.example.david.zoneify;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.david.zoneify.databinding.FragmentZoneBindingImpl;
import com.example.david.zoneify.databinding.FragmentZoneListBindingImpl;
import com.example.david.zoneify.databinding.ZoneItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTZONE = 1;

  private static final int LAYOUT_FRAGMENTZONELIST = 2;

  private static final int LAYOUT_ZONEITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.david.zoneify.R.layout.fragment_zone, LAYOUT_FRAGMENTZONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.david.zoneify.R.layout.fragment_zone_list, LAYOUT_FRAGMENTZONELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.david.zoneify.R.layout.zone_item, LAYOUT_ZONEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTZONE: {
          if ("layout/fragment_zone_0".equals(tag)) {
            return new FragmentZoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_zone is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTZONELIST: {
          if ("layout/fragment_zone_list_0".equals(tag)) {
            return new FragmentZoneListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_zone_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ZONEITEM: {
          if ("layout/zone_item_0".equals(tag)) {
            return new ZoneItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for zone_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "zone");
      sKeys.put(2, "zoneListViewModel");
      sKeys.put(3, "zoneViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_zone_0", com.example.david.zoneify.R.layout.fragment_zone);
      sKeys.put("layout/fragment_zone_list_0", com.example.david.zoneify.R.layout.fragment_zone_list);
      sKeys.put("layout/zone_item_0", com.example.david.zoneify.R.layout.zone_item);
    }
  }
}
