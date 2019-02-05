package com.example.openwebinar.installingandroidannframework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Layout objects
    private Button bChangeTv = null;
    private TextView tvHelloWorld = null;

    //String resource object
    private String englishHelloWorld = null;
    private String spanishHelloWorld = null;
    private String frenchHelloWorld = null;

    //Logical objects
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bChangeTv = findViewById(R.id.b_change_tv);
        tvHelloWorld = findViewById(R.id.tv_hello_world);

        englishHelloWorld = getString(R.string.tv_first_hello_world);
        spanishHelloWorld = getString(R.string.tv_second_hello_world);
        frenchHelloWorld  = getString(R.string.tv_third_hello_world);


        bChangeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bChangeTvEvent();
            }

        });
    }

    private void bChangeTvEvent() {
            System.out.println("Executing event (" + counter + ")");
            counter++;
            switch (counter%3) {
                case 0:
                    tvHelloWorld.setText(englishHelloWorld);
                    break;
                case 1:
                    tvHelloWorld.setText(spanishHelloWorld);
                    break;
                case 2:
                    tvHelloWorld.setText(frenchHelloWorld);
                    break;
            }
    }
}
