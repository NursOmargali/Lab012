package com.example.lab1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {

    EditText myEditText;
    Button myButton;
    String curency;
    String textValue;
    double fromStringToInt;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        myEditText = (EditText)findViewById(R.id.convertNum);
        myButton = (Button)findViewById(R.id.convertBttn);

        myButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textValue = myEditText.getText().toString();
                        fromStringToInt = Double.parseDouble(textValue);
                        curency = String.valueOf((fromStringToInt/379));
                        Toast.makeText(getApplicationContext(),curency, duration).show();
                     }
                }
        );

    }

}
