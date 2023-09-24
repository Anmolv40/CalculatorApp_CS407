package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResult2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result2);
        textView = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String firstNumber = intent.getStringExtra("firstNumber");
        String secondNumber = intent.getStringExtra("secondNumber");
        String button = intent.getStringExtra("button");
        double one = Double.valueOf(firstNumber);
        double two = Double.valueOf(secondNumber);
        double result =0;
        switch (button) {
            case "+":
                result = one+two;
                break;
            case "-":
                result = one-two;
                break;
            case "*":
                result = one*two;
                break;
            case "/":
                if (two == 0){
                    textView.setText("Error: Division by Zero");
                    return;
                }
                result = one/two;
                break;
        }
        textView.setText(Double.toString(result));
    }

}