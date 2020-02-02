package com.devsai.mydaggerapp;

import android.util.Log;

public class Car {

    private Engine engine;
    private Wheels wheels;
    private static final String TAG = "Car";

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    void drive() {

        Log.d(TAG, "drive: ");
    }
}
