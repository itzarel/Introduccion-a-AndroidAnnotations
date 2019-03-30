package com.example.openwebinar.installingandroidannframework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    //Layout objects - https://github.com/androidannotations/androidannotations/wiki/Injecting-Views
    @ViewById(R.id.tv_hello_world)
    TextView tvHelloWorld;

    //String resource object - https://github.com/androidannotations/androidannotations/wiki/Resources#stringres
    @StringRes(R.string.tv_first_hello_world)
    String englishHelloWorld;
    @StringRes(R.string.tv_second_hello_world)
    String spanishHelloWorld;
    @StringRes(R.string.tv_third_hello_world)
    String frenchHelloWorld;

    //Logical objects
    int counter = 0;



    @Click(R.id.b_change_tv)
    void bChangeTvEvent() {
            System.out.println("Executing event (" + counter + ")");
            counter++;
            switch (counter%3) {
                case 0:
                    tvHelloWorld.setText(englishHelloWorld);
                    break;
                case 1:
                    tvHelloWorld.setText(spanishHelloWorld);
                    break;
                case 2:
                    tvHelloWorld.setText(frenchHelloWorld);
                    break;
            }
    }
}
