package com.example.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class obesityClass1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_obesity_class1);

        TextView obesityClass1Result = (TextView) findViewById(R.id.obesityClass1Results);
        obesityClass1Result.setText(MainActivity.sentComments);
        TextView linkObesityClass1 = (TextView) findViewById(R.id.linkObesityClass1);

        linkObesityClass1.setMovementMethod(LinkMovementMethod.getInstance());
        Button chcekAnother = (Button) findViewById(R.id.checkAnother);




    }









    public void checkAnother(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }


    public void onBackPressed() {

    }
}
