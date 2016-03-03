package com.gym.k31536.coffeeapp;

import android.app.Application;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class CoffeeApp extends Application {

    private ObjectGraph objectGraph;

    @Inject
    CoffeeMaker coffeeMaker;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(new DripCoffeeModule());
        objectGraph.inject(this);
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
}