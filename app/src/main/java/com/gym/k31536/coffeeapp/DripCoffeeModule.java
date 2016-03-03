package com.gym.k31536.coffeeapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects=CoffeeApp.class,
        includes=PumpModule.class
)

public class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
