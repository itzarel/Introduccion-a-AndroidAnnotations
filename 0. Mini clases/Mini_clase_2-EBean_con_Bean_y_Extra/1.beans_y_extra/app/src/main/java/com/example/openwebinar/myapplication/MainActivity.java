package com.example.openwebinar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.openwebinar.myapplication.activities.MyActivity;
import com.example.openwebinar.myapplication.activities.MyActivity_;
import com.example.openwebinar.myapplication.beans.MyBean;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Bean
    MyBean myBean;

    @Override
    protected void onStart() {
        super.onStart();

        //Bean
        myBean.setId(1);
        myBean.setValue("Hello World");

        Log.d("", "-----------------------------------------------------------------------> " + myBean);

        //Extra
        MyActivity_.intent(this).myReceivedMessage("Hello World").start();
    }
}
