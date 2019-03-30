package com.example.openwebinar.enhancedcomponents.newappication.beans;

import android.content.Context;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

@EBean
public class ContextInfo {

    @RootContext
    Context context;

    public void getContextInfo() {
        System.out.println("INFO ======> " + context.getApplicationInfo() );
        System.out.println("PACK ======> " + context.getPackageName() );
        System.out.println("PATH ======> " + context.getPackageResourcePath() );
        System.out.println("CONT ======> " + context.getApplicationContext() );
    }
}
