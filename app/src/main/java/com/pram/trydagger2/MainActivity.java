package com.pram.trydagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pram.trydagger2.Car.Car;
import com.pram.trydagger2.dagger.ActivityComponent;
import com.pram.trydagger2.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
