package com.sweedelight.ganesh.sweedelight.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.sweedelight.ganesh.sweedelight.R;

public class Splash extends AppCompatActivity {
    private ImageView imageView;
    private Animation animation;
    private Animation animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView= (ImageView)findViewById(R.id.imageView);
        animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.splash_anim);
        animation2= AnimationUtils.loadAnimation(getBaseContext(),R.anim.splashfadeout);
        animation.setDuration(2000);
        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation2);
                finish();
                Intent intent= new Intent(getBaseContext(), ImageSlider.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
