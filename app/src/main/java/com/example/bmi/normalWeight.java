package com.example.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class normalWeight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_normal_weight);

        ImageView background = (ImageView) findViewById(R.id.normalBackground);
        TextView result = (TextView) findViewById(R.id.normalWeightText);
        TextView normalWeightComments = (TextView) findViewById(R.id.normalWeightComments);
        TextView linkNormalWeight = (TextView) findViewById(R.id.linkNormalWeight);
        linkNormalWeight.setMovementMethod(LinkMovementMethod.getInstance());

        result.setText(MainActivity.sentComments);
    }

    public void onBackPressed(){}
    public void checkAnother(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}
