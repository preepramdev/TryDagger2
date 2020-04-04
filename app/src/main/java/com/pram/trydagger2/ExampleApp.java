package com.pram.trydagger2;

import android.app.Application;

import com.pram.trydagger2.dagger.AppComponent;
import com.pram.trydagger2.dagger.DaggerAppComponent;
import com.pram.trydagger2.dagger.DriverModule;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
