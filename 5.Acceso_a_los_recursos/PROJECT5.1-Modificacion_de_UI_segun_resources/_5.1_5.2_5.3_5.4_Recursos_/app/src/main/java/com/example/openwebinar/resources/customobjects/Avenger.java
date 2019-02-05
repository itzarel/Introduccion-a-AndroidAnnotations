package com.example.openwebinar.resources.customobjects;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.openwebinar.resources.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EViewGroup;

@EViewGroup(R.layout.avenger)
public class Avenger extends RelativeLayout {

    private TextView tvAvenger;
    private LinearLayout llColor1, llColor2, llColor3, llColor4, llColor5;


    public Avenger(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @AfterViews
    void initUI() {
        tvAvenger = findViewById(R.id.tv_avenger);

        llColor1 = findViewById(R.id.ll_color_1);
        llColor2 = findViewById(R.id.ll_color_2);
        llColor3 = findViewById(R.id.ll_color_3);
        llColor4 = findViewById(R.id.ll_color_4);
        llColor5 = findViewById(R.id.ll_color_5);
    }

    public void initAvenger(String actor, String hero, int color1, int color2, int color3, int color4, int color5) {
        String toShowInTextView = actor + " is " + hero;
        tvAvenger.setText(toShowInTextView);
        llColor1.setBackgroundColor(color1);
        llColor2.setBackgroundColor(color2);
        llColor3.setBackgroundColor(color3);
        llColor4.setBackgroundColor(color4);
        llColor5.setBackgroundColor(color5);
    }
}
