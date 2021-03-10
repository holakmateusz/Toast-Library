
package com.reactlibrarynativetoast;

import android.support.annotation.NonNull;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNNativeToastLibraryModule extends ReactContextBaseJavaModule {

    public RNNativeToastLibraryModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "RNNativeToastLibraryModule";
    }

    @ReactMethod
    public void showToast(String text) {
        Toast.makeText(getReactApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}