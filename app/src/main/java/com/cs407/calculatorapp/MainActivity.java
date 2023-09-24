package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.editTextFirst);
        EditText secondNumber = (EditText) findViewById(R.id.editTextSecond);
        Button btn = (Button) findViewById(view.getId());
        String text = btn.getText().toString();
        //Toast.makeText(MainActivity.this, textField.getText().toString(),
        //        Toast.LENGTH_LONG).show();
        goToActivity(firstNumber.getText().toString(),secondNumber.getText().toString(),text);
    }

    public void goToActivity(String first, String second, String button)
    {
        Intent intent = new Intent(this, CalculatorResult2.class);
        Bundle extras = new Bundle();
        extras.putString("firstNumber",first);
        extras.putString("secondNumber",second);
        extras.putString("button",button);
        intent.putExtras(extras);
        //intent.putExtra("message",first);
        startActivity(intent);
    }
}