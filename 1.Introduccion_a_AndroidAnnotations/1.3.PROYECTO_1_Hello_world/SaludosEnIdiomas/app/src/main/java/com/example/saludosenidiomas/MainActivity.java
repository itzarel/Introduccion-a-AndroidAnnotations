package com.example.saludosenidiomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @StringRes
    String tv_en_hello_world;
    @StringRes
    String tv_fr_hello_world;
    @StringRes
    String tv_es_hello_world;

    @ViewById
    TextView tv_hello;

    private int counter = 0;

    @Click
    void b_change() {
        final int EN = 0;
        final int FR = 1;
        final int ES = 2;

        counter++;

        switch (counter%3) {
            case EN:
                tv_hello.setText(tv_en_hello_world);
                break;
            case FR:
                tv_hello.setText(tv_fr_hello_world);
                break;
            case ES:
                tv_hello.setText(tv_es_hello_world);
                break;

        }
    }
}
