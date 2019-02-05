package com.example.openwebinar.enhancedcomponents.newappication;

import android.app.Application;

import com.example.openwebinar.enhancedcomponents.newappication.beans.RandomBinary;
import com.example.openwebinar.enhancedcomponents.newappication.beans.RandomChar;
import com.example.openwebinar.enhancedcomponents.newappication.beans.RandomNumbers;
import com.example.openwebinar.enhancedcomponents.newappication.beans.RandomOctal;
import com.example.openwebinar.enhancedcomponents.newappication.beans.randomhex.RandomHex;
import com.example.openwebinar.enhancedcomponents.newappication.beans.randomhex.RandomHexImpl;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;

@EApplication
public class SubApplication extends Application {

    @Bean
    RandomOctal randomOctal;
    @Bean(RandomHexImpl.class)
    RandomHex randomHex;

    public void onCreate() {
        super.onCreate();
        System.out.println("In creation time: \n\n" +
                "***************************************************************************\n" +
                "******************************* Hello World *******************************\n" +
                "***************************************************************************\n\n");
    }

    public String octalSum() {
        int randomOctalX = randomOctal.generateRandomNumber();
        int randomOctalY = randomOctal.generateRandomNumber();
        return "Octal sum: " + randomOctalX + " + " + randomOctalY + " = " +
                Integer.toOctalString( (randomOctalX + randomOctalY) );
    }

    public String hexSum() {
        int randomHexX = randomHex.generateRandomNumber();
        int randomHexY = randomHex.generateRandomNumber();

        return "Hexadecimal sum: " + randomHex.stringValue(randomHexX) + " + " + randomHex.stringValue(randomHexY) + " = " +
                randomHex.stringValue( (randomHexX + randomHexY) );
    }

    @Bean
    public void binarySum(RandomBinary randomBinary) {
        String generatedInfo;

        if (randomBinary != null) {
            int randomBinX = randomBinary.generateRandomNumber();
            int randomBinY = randomBinary.generateRandomNumber();

            generatedInfo = "Binary sum: " + randomBinX + " + " + randomBinY + " = " +
                    Integer.toBinaryString( (randomBinX + randomBinY) );
        } else {
            generatedInfo = "[not init]";
        }

        System.out.println("BIN ======> " + generatedInfo);
    }

    public void sum(@Bean RandomNumbers randomNumbers, @Bean RandomChar randomChar) {
        if (randomChar != null) {
            System.out.println("CHAR ======> '" + randomChar.generateRandomChar()+"'");
        }

        if (randomNumbers != null) {
            int randomX = randomNumbers.generateRandomNumber();
            int randomY = randomNumbers.generateRandomNumber();

            System.out.println("SUM: " + randomX + " + " + randomY + " = " + (randomX + randomY) + "\n\n");
        }
    }
}
