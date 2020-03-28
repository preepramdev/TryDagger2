package com.pram.trydagger2.dagger;

import com.pram.trydagger2.Car.Engine;
import com.pram.trydagger2.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
