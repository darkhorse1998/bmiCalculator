package com.example.bmi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class bmiResults extends AppCompatActivity {
MainActivity obj = new MainActivity();
//
////    private ProgressBar progressbar;
//private int progressStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bmi_results);
        final TextView text = (TextView) findViewById(R.id.result);
        text.setText(MainActivity.sentComments);


    }


    public void onBackPressed(){

    }
    public void goTo(View view){
        setContentView(R.layout.activity_splash_entry);
    }
}
