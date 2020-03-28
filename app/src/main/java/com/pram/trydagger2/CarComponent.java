package com.pram.trydagger2;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
//@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
