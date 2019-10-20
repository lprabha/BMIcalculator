package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View v){
        EditText editTextHeight = (EditText)findViewById(R.id.height);
        EditText editTextWeight = (EditText) findViewById(R.id.weight);
        TextView textViewResult = (TextView) findViewById(R.id.calc);

        double height = Double.parseDouble(editTextHeight.getText().toString());
        double weight = Double.parseDouble(editTextWeight.getText().toString());
        double BMIRESULT = weight/(height*height);
        textViewResult.setText(Double.toString(BMIRESULT));


    }
}
