package com.bp.pruebatweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.image);
        /*Se carga la animación creada en res/anim*/
        Animation myAnimation = AnimationUtils.loadAnimation(this,R.anim.my_animation);
        /*Se inicia la animación*/
        image.startAnimation(myAnimation);
    }
}
