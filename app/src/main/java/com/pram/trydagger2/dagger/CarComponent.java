package com.pram.trydagger2.dagger;

import com.pram.trydagger2.Car.Car;
import com.pram.trydagger2.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
//@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
