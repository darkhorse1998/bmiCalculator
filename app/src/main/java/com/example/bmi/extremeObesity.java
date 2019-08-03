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

public class extremeObesity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_extreme_obesity);

        TextView extremeObesityResult = (TextView) findViewById(R.id.extremeObesityResult);
        extremeObesityResult.setText(MainActivity.sentComments);

        TextView linkExtremeObesity = (TextView) findViewById(R.id.linkExtremeObesity);
        linkExtremeObesity.setMovementMethod(LinkMovementMethod.getInstance());

        Button checkAnother = (Button) findViewById(R.id.checkAnother);
    }

    @Override
    public void onBackPressed() {

    }
    public void checkAnother(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}
