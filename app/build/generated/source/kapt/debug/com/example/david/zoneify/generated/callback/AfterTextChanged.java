package com.example.david.zoneify.generated.callback;
public final class AfterTextChanged implements androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged {
    final Listener mListener;
    final int mSourceId;
    public AfterTextChanged(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void afterTextChanged(android.text.Editable callbackArg_0) {
        mListener._internalCallbackAfterTextChanged(mSourceId , callbackArg_0);
    }
    public interface Listener {
        void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0);
    }
}