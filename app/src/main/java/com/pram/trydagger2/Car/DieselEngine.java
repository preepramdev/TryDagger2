package com.pram.trydagger2.Car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.e(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
