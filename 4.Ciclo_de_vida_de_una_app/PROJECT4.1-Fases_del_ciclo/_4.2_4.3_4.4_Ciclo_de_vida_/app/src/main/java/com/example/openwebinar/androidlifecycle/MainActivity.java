package com.example.openwebinar.androidlifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.openwebinar.androidlifecycle.extras.SecondActivity_;

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@SuppressLint("Registered")
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    // https://github.com/androidannotations/androidannotations/wiki/Extras#executing-code-after-extras-injection
    @AfterExtras
    public void initAfterExtrasInjection() {
        System.out.println("*****************************: MainActivity::MainActivity_ >> onCreate >> init_ >> initAfterExtrasInjection");
        System.out.println("MainActivity_: onCreate\n"+
                            "|--MainActivity_: init_\n"+
                            "|----MainActivity_: injectExtras_\n"+
                            "|--------MainActivity: initAfterExtrasInjection\n");
    }

    // https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection
    @AfterInject
    public void initAfterInjection() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::MainActivity_ >> onCreate >> init_ >> initAfterInjection");
        System.out.println("MainActivity_: onCreate\n"+
                           "|--MainActivity_: init_\n"+
                           "|----MainActivity: initAfterInjection\n");
    }

    // https://github.com/androidannotations/androidannotations/wiki/Injecting-Views#afterviews
    @AfterViews
    void initAfterViewInjection() {
        System.out.println("-----------------------------: MainActivity::MainActivity_ >> onViewChanged >> initAfterViewInjection");
        System.out.println("MainActivity_: onViewChanged\n"+
                           "|--MainActivity: initAfterViewInjection\n");

        SecondActivity_.intent(this).message("New message").start() ;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("*****************************: MainActivity::onCreate");
        System.out.println("MainActivity_: onCreate\n"+
                           "|--MainActivity: onCreate\n"+
                           "|----AppCompatActivity: onCreate\n");
    }

    @Override
    protected void onStart() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        System.out.println("+++++++++++++++++++++++++++++: MainActivity::onDestroy");
        super.onDestroy();
    }




}
