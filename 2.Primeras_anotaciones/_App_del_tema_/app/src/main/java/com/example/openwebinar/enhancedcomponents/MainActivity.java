package com.example.openwebinar.enhancedcomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.openwebinar.enhancedcomponents.newappication.SubApplication;

import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;

/**Allow AndroidAnnotations int this project*/
@EActivity
public class MainActivity extends AppCompatActivity {

    @App //We will see in class "Anotación App" from "Inyección" section.
    SubApplication subApplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**You can select the layout programatically*/
//            setContentView(R.layout.activity_main);
//            setContentView(R.layout.activity_second);
//            setContentView(R.layout.activity_third);
            setContentView(R.layout.activity_fourth);

    }
}
