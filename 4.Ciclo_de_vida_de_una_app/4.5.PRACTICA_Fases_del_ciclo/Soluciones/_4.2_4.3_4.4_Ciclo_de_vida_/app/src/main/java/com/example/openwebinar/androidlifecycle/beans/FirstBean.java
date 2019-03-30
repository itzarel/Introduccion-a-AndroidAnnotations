package com.example.openwebinar.androidlifecycle.beans;

import com.example.openwebinar.androidlifecycle.apps.NewApp;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

@EBean
public class FirstBean {

    @Bean
    SecondBean secondBean;

    @App
    NewApp newApp;

    public FirstBean() {
        System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}: FirstBean");
        System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}: FirstBean::secondBean " + secondBean);
        System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}: FirstBean::secondBean " + newApp);
    }

    // https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection
    @AfterInject
    public void initAfterInjection() {
        System.out.println("+++++++++++++++++++++++++++++: FirstBean::initAfterInjection");
        System.out.println("+++++++++++++++++++++++++++++: FirstBean::secondBean: " + newApp);
    }

}
