package com.example.openwebinar.enhancedcomponents.views;

import android.content.Context;
import android.util.AttributeSet;

import org.androidannotations.annotations.EView;

@EView
public class CustomButton extends android.support.v7.widget.AppCompatButton {

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText("My Custom Button");
    }

}
