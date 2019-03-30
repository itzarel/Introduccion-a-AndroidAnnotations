package com.example.openwebinar.resources;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.AnimationRes;
import org.androidannotations.annotations.res.BooleanRes;
import org.androidannotations.annotations.res.ColorRes;
import org.androidannotations.annotations.res.StringRes;

@SuppressLint("Registered")
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @StringRes(R.string.the_avengers)
    String avengers;
    @StringRes
    String iron_man;
    @StringRes
    String iron_man_actor;
    @StringRes
    String viuda_negra, viuda_negra_actor;
    @StringRes
    String capitan_america, capitan_america_actor;
    @StringRes
    String thor, thor_actor;
    @StringRes
    String hulk, hulk_actor;
    @StringRes
    String sprider_man, sprider_man_actor;

    @ColorRes(R.color.iron_man_1)
    int ironMan1;
    @ColorRes(R.color.iron_man_2)
    int ironMan2;
    @ColorRes(R.color.iron_man_3)
    int ironMan3;
    @ColorRes(R.color.iron_man_4)
    int ironMan4;
    @ColorRes(R.color.iron_man_5)
    int ironMan5;
    @ColorRes
    int viuda_negra_1, viuda_negra_2, viuda_negra_3, viuda_negra_4, viuda_negra_5;
    @ColorRes
    int capitan_america_1, capitan_america_2, capitan_america_3, capitan_america_4, capitan_america_5;
    @ColorRes
    int thor_1, thor_2, thor_3,  thor_4,  thor_5;
    @ColorRes
    int hulk_1, hulk_2, hulk_3, hulk_4, hulk_5;
    @ColorRes
    int sprider_man_1, sprider_man_2, sprider_man_3, sprider_man_4, sprider_man_5;

    @BooleanRes(R.bool.is_infinity_war)
    boolean isInfinityWarSelected;
    @BooleanRes
    boolean is_iron_man, is_viuda_negra, is_capitan_america, is_thor, is_hulk, is_sprider_man;

    @AnimationRes(R.anim.zoom_in_animation)
    Animation zoomInAnimation;
    @AnimationRes
    Animation zoom_in_animation;


    @AfterViews
    void AfterViewsInit() {
        System.out.println("=============================> " + avengers + ":\n\n" +
                              "=========================================> " + generateAvengerInfo(iron_man_actor, iron_man, ironMan1, ironMan2, ironMan3, ironMan4, ironMan5, is_iron_man) +
                              "=========================================> " + generateAvengerInfo(sprider_man_actor, sprider_man, sprider_man_1, sprider_man_2, sprider_man_3, sprider_man_4, sprider_man_5, is_sprider_man) +
                              "=========================================> " + generateAvengerInfo(capitan_america_actor, capitan_america, capitan_america_1, capitan_america_2, capitan_america_3, capitan_america_4, capitan_america_5, is_capitan_america) +
                              "=========================================> " + generateAvengerInfo(viuda_negra_actor, viuda_negra, viuda_negra_1, viuda_negra_2, viuda_negra_3, viuda_negra_4, viuda_negra_5, is_viuda_negra) +
                              "=========================================> " + generateAvengerInfo(thor_actor, thor, thor_1, thor_2, thor_3, thor_4, thor_5, is_thor) +
                              "=========================================> " + generateAvengerInfo(hulk_actor, hulk, hulk_1, hulk_2, hulk_3, hulk_4, hulk_5, is_hulk) );

        System.out.println("-----------------------------------------------------------------------\n\n");
        System.out.println("=============================> Is infinity war?: " + isInfinityWarSelected + "\n\n" );

        System.out.println("-----------------------------------------------------------------------\n\n");
        System.out.println("=============================> zoomInAnimation: " + zoomInAnimation + "\n\n" +
                           "=============================> zoom_in_animation: " + zoom_in_animation + "\n\n");
    }



    private String generateAvengerInfo(String actor, String heroe, int color1, int color2, int color3, int color4, int color5, boolean isSelected) {
        return actor + " as " + heroe + " with colors [#" + Integer.toHexString(color1).toUpperCase() + ", #" + Integer.toHexString(color2).toUpperCase() + ", #" + Integer.toHexString(color3).toUpperCase() + ", #" + Integer.toHexString(color4).toUpperCase() + ", #" + Integer.toHexString(color5).toUpperCase() + "]. Is " + heroe + " selected? " + isSelected + " \n\n";
    }
}
