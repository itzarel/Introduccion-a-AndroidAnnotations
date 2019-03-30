package com.example.openwebinar.androidlifecycle.extras;

import android.app.Activity;
import android.widget.TextView;

import com.example.openwebinar.androidlifecycle.R;
import com.example.openwebinar.androidlifecycle.apps.NewApp;
import com.example.openwebinar.androidlifecycle.beans.FirstBean;

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

// @EActivity //(1)
@EActivity(R.layout.activity_main) //(2)
public class SecondActivity extends Activity {


    @Extra
    String message;

    @Bean
    FirstBean firstBean;

    @App
    NewApp newApp;

    @ViewById(R.id.tv_hello_world)
    TextView tvHelloWorld;

    public SecondActivity() {
        System.out.println("*****************************: SecondActivity");
        System.out.println("*****************************: SecondActivity::message: " + message);
        System.out.println("*****************************: SecondActivity::firstBean: " + firstBean);
        System.out.println("*****************************: SecondActivity::newApp: " + newApp);
        System.out.println("*****************************: SecondActivity::tvHelloWorld: " + tvHelloWorld);
    }

    // https://github.com/androidannotations/androidannotations/wiki/Extras#executing-code-after-extras-injection
    @AfterExtras
    public void initAfterExtrasInjection() {
        System.out.println("*****************************: SecondActivity::initAfterExtrasInjection");
        System.out.println("*****************************: SecondActivity::message: " + message);
        System.out.println("*****************************: SecondActivity::firstBean: " + firstBean);
        System.out.println("*****************************: SecondActivity::newApp: " + newApp);
        System.out.println("*****************************: SecondActivity::tvHelloWorld: " + tvHelloWorld);
    }

    // https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection
    @AfterInject
    public void initAfterInjection() {
        System.out.println("+++++++++++++++++++++++++++++: SecondActivity::initAfterInjection");
        System.out.println("+++++++++++++++++++++++++++++: SecondActivity::message: " + message);
        System.out.println("+++++++++++++++++++++++++++++: SecondActivity::firstBean: " + firstBean);
        System.out.println("+++++++++++++++++++++++++++++: SecondActivity::newApp: " + newApp);
        System.out.println("+++++++++++++++++++++++++++++: SecondActivity::tvHelloWorld: " + tvHelloWorld);
    }

    // https://github.com/androidannotations/androidannotations/wiki/Injecting-Views#afterviews
    @AfterViews
    void initAfterViewInjection() {
        System.out.println("-----------------------------: SecondActivity::initAfterViewInjection");
        System.out.println("-----------------------------: SecondActivity::message: " + message);
        System.out.println("-----------------------------: SecondActivity::firstBean: " + firstBean);
        System.out.println("-----------------------------: SecondActivity::newApp: " + newApp);
        System.out.println("-----------------------------: SecondActivity::tvHelloWorld: " + tvHelloWorld);
    }
}
