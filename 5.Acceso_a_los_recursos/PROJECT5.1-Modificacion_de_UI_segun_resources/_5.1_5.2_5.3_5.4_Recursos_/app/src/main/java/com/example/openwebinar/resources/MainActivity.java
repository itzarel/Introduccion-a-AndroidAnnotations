package com.example.openwebinar.resources;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;

import com.example.openwebinar.resources.customobjects.Avenger_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.AnimationRes;
import org.androidannotations.annotations.res.BooleanRes;
import org.androidannotations.annotations.res.ColorRes;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @StringRes(R.string.the_avengers)
    String avengers;

    @StringRes
    String iron_man;
    @StringRes
    String iron_man_actor;
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

    @StringRes
    String viuda_negra, viuda_negra_actor;
    @ColorRes
    int viuda_negra_1, viuda_negra_2, viuda_negra_3, viuda_negra_4, viuda_negra_5;

    @StringRes
    String capitan_america, capitan_america_actor;
    @ColorRes
    int capitan_america_1, capitan_america_2, capitan_america_3, capitan_america_4, capitan_america_5;

    @StringRes
    String thor, thor_actor;
    @ColorRes
    int thor_1, thor_2, thor_3,  thor_4,  thor_5;

    @StringRes
    String hulk, hulk_actor;
    @ColorRes
    int hulk_1, hulk_2, hulk_3, hulk_4, hulk_5;

    @StringRes
    String sprider_man, sprider_man_actor;
    @ColorRes
    int sprider_man_1, sprider_man_2, sprider_man_3, sprider_man_4, sprider_man_5;

    @BooleanRes(R.bool.is_infinity_war)
    boolean isInfinityWarSelected;
    @BooleanRes
    boolean is_iron_man, is_sprider_man, is_capitan_america, is_viuda_negra, is_thor, is_hulk;

    @AnimationRes(R.anim.filp_animation)
    Animation flip;
    @AnimationRes
    Animation fade_in;


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
        System.out.println("=============================> flip: " + flip + "\n\n" +
                           "=============================> filp_animation: " + fade_in + "\n\n");

        if (is_iron_man) {
            Avenger_ avenger1;
            avenger1 = findViewById(R.id.firstAvenger);
            avenger1.setVisibility(View.VISIBLE);
            avenger1.initAvenger(iron_man_actor, iron_man, ironMan1, ironMan2, ironMan3, ironMan4, ironMan5);
            if (isInfinityWarSelected) {
                avenger1.startAnimation(flip);
            } else {
                avenger1.startAnimation(fade_in);
            }
        }

        if (is_sprider_man) {
            Avenger_ avenger2;
            avenger2 = findViewById(R.id.secondAvenger);
            avenger2.setVisibility(View.VISIBLE);
            avenger2.initAvenger(sprider_man_actor, sprider_man, sprider_man_1, sprider_man_2, sprider_man_3, sprider_man_4, sprider_man_5);
            if (isInfinityWarSelected) {
                avenger2.startAnimation(flip);
            } else {
                avenger2.startAnimation(fade_in);
            }
        }

        if (is_capitan_america) {
            Avenger_ avenger3;
            avenger3 = findViewById(R.id.thirdAvenger);
            avenger3.setVisibility(View.VISIBLE);
            avenger3.initAvenger(capitan_america_actor, capitan_america, capitan_america_1, capitan_america_2, capitan_america_3, capitan_america_4, capitan_america_5);
            if (isInfinityWarSelected) {
                avenger3.startAnimation(flip);
            } else {
                avenger3.startAnimation(fade_in);
            }
        }

        if (is_viuda_negra) {
            Avenger_ avenger4;
            avenger4 = findViewById(R.id.fourthAvenger);
            avenger4.setVisibility(View.VISIBLE);
            avenger4.initAvenger(viuda_negra_actor, viuda_negra, viuda_negra_1, viuda_negra_2, viuda_negra_3, viuda_negra_4, viuda_negra_5);
            if (isInfinityWarSelected) {
                avenger4.startAnimation(flip);
            } else {
                avenger4.startAnimation(fade_in);
            }
        }

        if (is_thor) {
            Avenger_ avenger5;
            avenger5 = findViewById(R.id.fifthAvenger);
            avenger5.setVisibility(View.VISIBLE);
            avenger5.initAvenger(thor_actor, thor, thor_1, thor_2, thor_3, thor_4, thor_5);
            avenger5.startAnimation(flip);
            if (isInfinityWarSelected) {
                avenger5.startAnimation(flip);
            } else {
                avenger5.startAnimation(fade_in);
            }
        }

        if (is_hulk) {
            Avenger_ avenger6;
            avenger6 = findViewById(R.id.sixthAvenger);
            avenger6.setVisibility(View.VISIBLE);
            avenger6.initAvenger(hulk_actor, hulk, hulk_1, hulk_2, hulk_3, hulk_4, hulk_5);
            if (isInfinityWarSelected) {
                avenger6.startAnimation(flip);
            } else {
                avenger6.startAnimation(fade_in);
            }
        }
    }



    private String generateAvengerInfo(String actor, String heroe, int color1, int color2, int color3, int color4, int color5, boolean isSelected) {
        return actor + " as " + heroe + " with colors [#" + Integer.toHexString(color1).toUpperCase() + ", #" + Integer.toHexString(color2).toUpperCase() + ", #" + Integer.toHexString(color3).toUpperCase() + ", #" + Integer.toHexString(color4).toUpperCase() + ", #" + Integer.toHexString(color5).toUpperCase() + "]. Is " + heroe + " selected? " + isSelected + " \n\n";
    }
}
