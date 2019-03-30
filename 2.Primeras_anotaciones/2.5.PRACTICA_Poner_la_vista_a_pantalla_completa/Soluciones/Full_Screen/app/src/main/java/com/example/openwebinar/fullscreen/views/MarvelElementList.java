package com.example.openwebinar.fullscreen.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.openwebinar.fullscreen.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.custom_marvel_element_list)
public class MarvelElementList extends RelativeLayout {

    @ViewById(R.id.tv_title) // We will see this annotation in nexts classes
    protected TextView tv_title;
    @ViewById(R.id.tv_description)  // We will see this annotation in nexts classes
    protected TextView tv_description;

    public MarvelElementList(Context context, AttributeSet attrs) {
        super(context, attrs);
//        findViewById()
    }

    public void setTexts(String titleText, String subTitleText) {
        tv_title.setText(titleText);
        tv_description.setText(subTitleText);
    }

}