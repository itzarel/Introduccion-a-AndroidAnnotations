package com.example.openwebinar.enhancedcomponents;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

@SuppressLint("Registered")
@EActivity
public class SecondActivity extends Activity {

    @Extra
    String myReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.finish();
    }

    @Extra
    void myMethodMessage(String myStringExtra){
        System.out.println("Received Message ===============> " + myReceivedMessage);
        System.out.println("INFO +++++++++++++++++++++++++++> " + myStringExtra);
    }

    void myMethodMessage(@Extra String name, @Extra String surname){
        System.out.println("Received Message ===============> " + myReceivedMessage);
        System.out.println("NAME ***************************> " + name);
        System.out.println("SURN ***************************> " + surname);
    }
}
