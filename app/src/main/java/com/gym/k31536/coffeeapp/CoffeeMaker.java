package com.gym.k31536.coffeeapp;

import javax.inject.Inject;

import dagger.Lazy;

public class CoffeeMaker {
    @Inject Lazy<Heater> heater;
    @Inject Pump pump;

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println("  [_]P coffee! [_]P ");
        heater.get().off();
    }
}
