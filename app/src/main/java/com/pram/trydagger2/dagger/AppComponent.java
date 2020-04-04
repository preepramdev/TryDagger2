package com.pram.trydagger2.dagger;

import com.pram.trydagger2.Car.Driver;
import com.pram.trydagger2.dagger.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();
}