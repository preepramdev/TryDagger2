package com.pram.trydagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pram.trydagger2.Car.Car;
import com.pram.trydagger2.dagger.CarComponent;
import com.pram.trydagger2.dagger.DaggerCarComponent;
import com.pram.trydagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

        component.inject(this);

        car.drive();
    }
}
