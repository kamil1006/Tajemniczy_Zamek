package com.example.tajemniczyzamek;

import android.app.Application;

public class ApplicationClass extends Application {

    public static boolean restart;

    @Override
    public void onCreate() {
        super.onCreate();
        restart=false;

    }
}
