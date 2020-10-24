package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XJZBMXhxp00xXtwrWEDMMjlSO1IzLnauW9TMtnTJ")
                .clientKey("8oydH93q8DvvkwsqZ4uF5NBjPsQACSaYMXpsDmnE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
