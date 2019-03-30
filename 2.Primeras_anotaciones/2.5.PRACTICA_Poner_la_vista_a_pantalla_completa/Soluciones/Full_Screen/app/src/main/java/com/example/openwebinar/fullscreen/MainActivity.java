package com.example.openwebinar.fullscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.example.openwebinar.fullscreen.views.MarvelElementList;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

@EActivity

// https://github.com/androidannotations/androidannotations/wiki/WindowFeatureAndFullscreen#fullscreen
@Fullscreen
// https://github.com/androidannotations/androidannotations/wiki/WindowFeatureAndFullscreen#windowfeature
@WindowFeature({ Window.FEATURE_NO_TITLE, Window.FEATURE_SWIPE_TO_DISMISS })
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.firstMarvelElementList)  // We will see this annotation in nexts classes
    protected MarvelElementList firstMarvelElementList;
    @ViewById(R.id.secondMarvelElementList)  // We will see this annotation in nexts classes
    protected MarvelElementList secondMarvelElementList;
    @ViewById(R.id.thirdMarvelElementList)  // We will see this annotation in nexts classes
    protected MarvelElementList thirdMarvelElementList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideNavigationBar();
        inits();
    }

    private void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }


    protected void inits() {
        String capAmerica = "CAPITÁN AMÉRICA";
        String capAmericaDesc = "Capitán América, cuyo nombre real es Steven Grant Rogers, mejor conocido como Steve Rogers, es un superhéroe y justiciero ficticio que aparece...";

        String ironMan = "IRON MAN";
        String ironManDesc = "Iron Man, es un superhéroe de Marvel Comics. Tras el apodo se encuentra el famoso multimillonario Anthony Edward Stark, más conocido como Tony Stark...";

        String hulk = "HULK";
        String hulkDesc = "Hulk es un personaje ficticio, un superhéroe que aparece en los cómics estadounidenses publicados por la editorial Marvel Comics. El personaje fue...";


        firstMarvelElementList.setTexts(capAmerica, capAmericaDesc);
        secondMarvelElementList.setTexts(ironMan, ironManDesc);
        thirdMarvelElementList.setTexts(hulk, hulkDesc);
    }

}
