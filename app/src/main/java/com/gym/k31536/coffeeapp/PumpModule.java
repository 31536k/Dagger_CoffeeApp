package com.gym.k31536.coffeeapp;

import dagger.Module;
import dagger.Provides;

@Module(complete=false, library=true)
public class PumpModule {
    @Provides
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
