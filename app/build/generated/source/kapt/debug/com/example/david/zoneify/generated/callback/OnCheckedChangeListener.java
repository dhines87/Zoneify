package com.example.david.zoneify.generated.callback;
public final class OnCheckedChangeListener implements android.widget.CompoundButton.OnCheckedChangeListener {
    final Listener mListener;
    final int mSourceId;
    public OnCheckedChangeListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onCheckedChanged(android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        mListener._internalCallbackOnCheckedChanged(mSourceId , callbackArg_0, callbackArg_1);
    }
    public interface Listener {
        void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1);
    }
}