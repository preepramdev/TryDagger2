package com.pram.trydagger2;

import android.app.Application;

import com.pram.trydagger2.dagger.AppComponent;
import com.pram.trydagger2.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
