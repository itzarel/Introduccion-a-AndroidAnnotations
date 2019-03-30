package com.example.miprimeraanotacioneactivity.bean;

import android.util.Log;

import org.androidannotations.annotations.EBean;

@EBean
public class MyBean {

    public MyBean() {
        Log.i("SubApplication", "In creation time: \n" +
                "***********************************************************************************" +
                "**** Bean created! ****************************************************************" +
                "***********************************************************************************");
    }
}
