package com.example.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public RadioButton radioOption;
public String bmiComment;
public static String sentComments = "";
public static double bmi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
//        if (!isTaskRoot()
//                && getIntent().hasCategory(Intent.CATEGORY_LAUNCHER)
//                && getIntent().getAction() != null
//                && getIntent().getAction().equals(Intent.ACTION_MAIN)) {
//
//            finish();
//            return;
//        }
        ImageView background = (ImageView) findViewById(R.id.mainBackground);
        TextView text = (TextView) findViewById(R.id.welcome);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText height = (EditText) findViewById(R.id.height);
        final RadioGroup options = (RadioGroup) findViewById(R.id.radioGroup);
//        RadioButton feet = (RadioButton) findViewById(R.id.feet);
//        RadioButton meter = (RadioButton) findViewById(R.id.meter);
        Button submit = (Button) findViewById(R.id.submit);
//        final Intent intent = new Intent(getApplicationContext(), bmiResults.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double finalWeight = Double.parseDouble(weight.getText().toString());
                double finalHeight = Double.parseDouble(height.getText().toString());
                String finalName = name.getText().toString();
                int selectID = options.getCheckedRadioButtonId();
                radioOption= (RadioButton) findViewById(selectID);
                String selectedOption = radioOption.toString();
                if(selectedOption.equals("Feet")){
                    finalHeight = finalHeight*0.3048;
                }
                bmi = bmiCalc(finalWeight,finalHeight);
                MainActivity.bmi = bmi;
                bmiComment = bmiComments(bmi);
                MainActivity.sentComments = finalName+", you belong to the "+bmiComment+" category";

//                startActivity(intent);
            }
        });


    }
    public double bmiCalc(double weight, double height){

        double bmi;
        bmi = weight/(height*height);

        return bmi;
    }

    public String bmiComments(double bmi){
        String comment = "";
        if(bmi<18.5) {comment = "UNDERWEIGHT"; Intent intent0 = new Intent(getApplicationContext(), underweight.class); startActivity(intent0);}
        else if(bmi>=18.5 && bmi<=24.9) {comment = "NORMAL WEIGHT"; Intent intent1 = new Intent(getApplicationContext(), normalWeight.class); startActivity(intent1);}
        else if(bmi>=25 && bmi<=29.9) {comment = "OVERWEIGHT"; Intent intent2 = new Intent(getApplicationContext(), overWeight.class); startActivity(intent2);}
        else if(bmi>=30 && bmi<=34.9) {comment = "OBESITY CLASS 1"; Intent intent3 = new Intent(getApplicationContext(), obesityClass1.class); startActivity(intent3);}
        else if(bmi>=35 && bmi<=39.9) {comment = "OBESITY CLASS 2"; Intent intent4 = new Intent(getApplicationContext(), obesityClass2.class); startActivity(intent4);}
        else if(bmi>=40) {comment = "EXTREME OBESITY"; Intent intent5 = new Intent(getApplicationContext(), extremeObesity.class); startActivity(intent5);}


        return comment;
    }
}
