package com.example.openwebinar.myapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

@EActivity
public class MyActivity extends Activity {

    @Extra
    String  myReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("", "-----------------------------------------------------------------------> " + myReceivedMessage);

        this.finish();
    }
}
