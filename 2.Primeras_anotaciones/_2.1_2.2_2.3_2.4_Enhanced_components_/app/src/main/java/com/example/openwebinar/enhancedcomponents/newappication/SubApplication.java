package com.example.openwebinar.enhancedcomponents.newappication;

import android.app.Application;

import com.example.openwebinar.enhancedcomponents.newappication.beans.RandomNumbers;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;

@EApplication
public class SubApplication extends Application {

    @Bean //We will see in class "Anotación Bean" from "Inyección" section.
    RandomNumbers randomNumbers;

    public void onCreate() {
        super.onCreate();
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Hello World *******************************\n" +
                "***************************************************************************\n\n");
    }

    // Sumar numero

    //Guardar histórico
}
