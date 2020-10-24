package com.example.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XJZBMXhxp00xXtwrWEDMMjlSO1IzLnauW9TMtnTJ")
                .clientKey("8oydH93q8DvvkwsqZ4uF5NBjPsQACSaYMXpsDmnE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
