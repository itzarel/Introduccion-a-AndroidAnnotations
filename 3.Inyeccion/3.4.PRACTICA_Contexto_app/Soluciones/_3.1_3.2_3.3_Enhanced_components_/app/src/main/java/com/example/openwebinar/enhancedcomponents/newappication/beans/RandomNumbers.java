package com.example.openwebinar.enhancedcomponents.newappication.beans;

import org.androidannotations.annotations.EBean;

import java.util.Random;

@EBean
public class RandomNumbers {

    RandomNumbers() {
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Bean created ******************************\n" +
                "***************************************************************************\n\n");
    }

    public int generateRandomNumber() {
        Random rand = new Random();

        // 99 is the maximum and the 1 is our minimum
        return rand.nextInt(100) + 1;
    }

}
