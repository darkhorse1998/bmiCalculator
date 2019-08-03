package com.example.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class underweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_underweight);

        ImageView background = (ImageView) findViewById(R.id.underWeightImage);
        TextView result = (TextView) findViewById(R.id.underWeightText);
        TextView underWeightComments = (TextView) findViewById(R.id.underWeightComments);
        TextView linkUnderWeight = (TextView) findViewById(R.id.linkUnderWeight);
        linkUnderWeight.setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.checkAnotherButton);
        result.setText(MainActivity.sentComments);




    }
    public void onBackPressed(){}

    public void checkAnother(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}
