package com.example.miprimeraanotacioneactivity.view;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import org.androidannotations.annotations.EView;

@EView
public class CustomButton extends AppCompatButton {

//    public CustomButton(Context context) {
//        super(context);
//    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText("My custom button!");
    }

//    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
}
