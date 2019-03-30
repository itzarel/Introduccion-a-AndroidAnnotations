package com.example.openwebinar.enhancedcomponents.newappication.beans;

import org.androidannotations.annotations.EBean;

import java.util.Random;

@EBean
public class RandomChar {

    RandomChar() {
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Octal Bean created ************************\n" +
                "***************************************************************************\n\n");
    }

    public char generateRandomChar() {
        Random rand = new Random();
        return (char) (rand.nextInt(127) + 33);
    }

}
