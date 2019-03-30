package com.example.openwebinar.enhancedcomponents.newappication.beans;

import org.androidannotations.annotations.EBean;

import java.util.Random;

@EBean
public class RandomBinary {

    RandomBinary() {
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Bin Bean created **************************\n" +
                "***************************************************************************\n\n");
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(2);
    }

}
