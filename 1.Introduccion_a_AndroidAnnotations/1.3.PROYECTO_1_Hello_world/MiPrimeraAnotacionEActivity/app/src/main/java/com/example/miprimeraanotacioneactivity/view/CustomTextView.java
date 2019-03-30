package com.example.miprimeraanotacioneactivity.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import org.androidannotations.annotations.EView;

@EView
public class CustomTextView extends AppCompatTextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText("My custom TextView :)");
    }

}
