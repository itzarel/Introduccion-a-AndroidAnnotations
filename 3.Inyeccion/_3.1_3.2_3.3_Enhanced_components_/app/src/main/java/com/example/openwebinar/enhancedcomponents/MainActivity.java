package com.example.openwebinar.enhancedcomponents;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.openwebinar.enhancedcomponents.newappication.SubApplication;

import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;


@SuppressLint("Registered")
@EActivity
public class MainActivity extends AppCompatActivity {

    private final String MESSAGE = "Avengers are really cool";
    private final String MESSAGE_NEW = "I love Avengers' Lego";
    private final String MESSAGE_NAME = "Iron";
    private final String MESSAGE_SURNAME = "Man";

    @App
    SubApplication subApplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**You can select the layout programatically*/
//            setContentView(R.layout.activity_main);
//            setContentView(R.layout.activity_second);
//            setContentView(R.layout.activity_third);
        setContentView(R.layout.activity_fourth);

        System.out.println("OCT ======> " + subApplication.octalSum());
        System.out.println("HEX ======> " + subApplication.hexSum());


        // Launch a new activity and shows the message. After the message the activity is closed.
        SecondActivity_.intent(this).myReceivedMessage(MESSAGE).start() ;
        SecondActivity_.intent(this).myMethodMessage(MESSAGE_NEW).start() ;
        SecondActivity_.intent(this).myMethodMessage(MESSAGE_NAME, MESSAGE_SURNAME).start() ;
    }


}
