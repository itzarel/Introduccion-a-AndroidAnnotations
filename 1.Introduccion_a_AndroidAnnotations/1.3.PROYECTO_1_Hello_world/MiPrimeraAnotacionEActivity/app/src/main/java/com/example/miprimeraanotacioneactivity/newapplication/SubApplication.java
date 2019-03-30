package com.example.miprimeraanotacioneactivity.newapplication;

import android.app.Application;
import android.util.Log;

import org.androidannotations.annotations.EApplication;

@EApplication
public class SubApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i("SubApplication", "In creation time: \n" +
                "***********************************************************************************" +
                "**** Hello World from SubApplication **********************************************" +
                "***********************************************************************************");
    }
}
