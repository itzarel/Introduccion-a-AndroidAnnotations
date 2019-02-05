package com.example.openwebinar.enhancedcomponents.views;

import android.content.Context;
import android.util.AttributeSet;

import org.androidannotations.annotations.EView;

import java.util.Random;

@EView
public class CustomTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Random rand = new Random();
        int octal = rand.nextInt(7);
        setText("Random octal (" + octal + ")");
    }

}
