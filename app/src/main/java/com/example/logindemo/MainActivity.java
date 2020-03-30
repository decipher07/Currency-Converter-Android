package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency (View view)
    {
        EditText editText = (EditText) findViewById(R.id.inrEditText);

        String amountInInr = editText.getText().toString();

        double amountInInrDouble = Double.parseDouble(amountInInr);

        double amountInDollarDouble = amountInInrDouble*0.013;

        String amountInDollar = String.valueOf(amountInDollarDouble);


        Log.i("Info","Button Pressed!");

        Log.i("INR",editText.getText().toString());

        Toast.makeText(this, amountInDollar + " $", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
