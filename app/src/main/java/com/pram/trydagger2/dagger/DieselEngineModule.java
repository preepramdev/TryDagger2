package com.pram.trydagger2.dagger;

import com.pram.trydagger2.Car.DieselEngine;
import com.pram.trydagger2.Car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
