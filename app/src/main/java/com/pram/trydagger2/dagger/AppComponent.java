package com.pram.trydagger2.dagger;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();


    @Component.Factory
    interface Factory {

        AppComponent create(DriverModule driverModule);
    }
}