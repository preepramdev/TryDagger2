package com.pram.trydagger2;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private static final String TAG = "Tires";

    public void inflate() {
        Log.e(TAG, "Tires inflated");
    }
}
