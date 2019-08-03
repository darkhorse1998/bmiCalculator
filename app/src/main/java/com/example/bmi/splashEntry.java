package com.example.bmi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

public class splashEntry extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_entry);

        ImageView logo = (ImageView) findViewById(R.id.icon);
//        ImageView background = (ImageView) findViewById(R.id.background);
        TextView introText = (TextView) findViewById(R.id.introText);
        final MediaPlayer introSound = MediaPlayer.create(this, R.raw.intro);
        final Animation anim = AnimationUtils.loadAnimation(this,R.anim.splash);

        logo.startAnimation(anim);
        introText.startAnimation(anim);
        introSound.start();
        final Intent intent = new Intent(this, MainActivity.class);
        final Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                }

            }
        };
        timer.start();

    }
}
