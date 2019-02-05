package com.example.openwebinar.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @AfterExtras
    void initAfterExtras() {
        Log.d("","----------------------------------------------------------------------->1 - AfterExtras");
    }

    @AfterInject
    void initAfterInject() {
        Log.d("","----------------------------------------------------------------------->2 - AfterInject");
    }

    @Override
    protected void onCreate(Bundle sIS) {
        super.onCreate(sIS);
        Log.d("","----------------------------------------------------------------------->3 - onCreate");
    }

    @AfterViews
    void initAfterViews() {
        Log.d("","----------------------------------------------------------------------->4 - AfterViews");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("","----------------------------------------------------------------------->5 - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("","----------------------------------------------------------------------->6 - onResume");
    }
}
