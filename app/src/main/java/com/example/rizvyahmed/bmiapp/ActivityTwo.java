package com.example.rizvyahmed.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button b1;
    TextView t1;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void calculateBMI(View view){
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);

        double hight=0;
        double weight=0;
        double bmi=0;
        String msg="";

        weight=Double.parseDouble(e1.getText().toString());
        hight=Double.parseDouble(e2.getText().toString());

        bmi=hight*hight;
        bmi=weight/bmi;

        t1.setText(String.valueOf(bmi));

        if (bmi<18.5){
            msg="UnderWeight";
        }
        else if (bmi>18.5 && bmi<25){
            msg="Normal";
        }
        else if(bmi>25){
            msg="OverWeight";
        }

        t2.setText(msg);


    }
}
