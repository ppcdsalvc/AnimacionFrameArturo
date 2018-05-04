package com.example.el_sk.animacionframearturo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button inicio,parar;
    ImageView cap;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicio = findViewById(R.id.btninicio);
        parar = findViewById(R.id.btnparar);
        cap = findViewById(R.id.imgcap);

        if(cap ==null){
            throw new AssertionError();
        }
        cap.setVisibility(View.VISIBLE);
        cap.setBackgroundResource(R.drawable.cap);

        animationDrawable= (AnimationDrawable) cap.getBackground();
        animationDrawable.setOneShot(true);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cap.setVisibility(View.VISIBLE);
                if (animationDrawable.isRunning()){
                    animationDrawable.stop();
                }
                animationDrawable.start();

            }
        });

        parar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });
    }
}
