package com.example.openwebinar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.ColorRes;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @StringRes(R.string.the_avengers)
    String avengersMessage;

    @ColorRes(R.color.color_1)
    int color1;


    @AfterViews
    void initAfterViews() {
        Log.d("","----------------------------------------------------------------------->" + avengersMessage + "  &  " + generateColorInfo());
    }


    private String generateColorInfo() {
        return "The main color is [#" + Integer.toHexString(color1).toUpperCase() + "]\n";
    }
}
