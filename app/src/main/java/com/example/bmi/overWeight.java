package com.example.bmi;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class overWeight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_over_weight);

        ImageView background = (ImageView) findViewById(R.id.overWeightBackground);
        TextView overWeightResults = (TextView) findViewById(R.id.overWeightResult);
        TextView overWeightComments = (TextView) findViewById(R.id.overWeightComments);
        TextView linkOverWeight = (TextView) findViewById(R.id.linkOverWeight);

        linkOverWeight.setMovementMethod(LinkMovementMethod.getInstance());
        overWeightResults.setText(MainActivity.sentComments);
    }
    public void onBackPressed(){}

    public void checkAnother(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}
