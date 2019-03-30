package com.example.openwebinar.enhancedcomponents.newappication.beans.randomhex;

import org.androidannotations.annotations.EBean;

import java.util.Random;

@EBean
public class RandomHexImpl implements RandomHex {

    RandomHexImpl() {
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Hex Bean created **************************\n" +
                "***************************************************************************\n\n");
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(17);
    }

    public String stringValue(int hexValue) {
        return Integer.toHexString(hexValue).toUpperCase();
    }

}
