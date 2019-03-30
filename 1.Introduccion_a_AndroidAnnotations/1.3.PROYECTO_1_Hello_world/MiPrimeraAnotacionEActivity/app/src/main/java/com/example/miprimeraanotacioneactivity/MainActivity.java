package com.example.miprimeraanotacioneactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;

//@EActivity(R.layout.activity_main)
@EActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_second);
//        setContentView(R.layout.activity_third);
        setContentView(R.layout.activity_test_custom_views);
    }
}
