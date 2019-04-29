package com.example.lab01;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginApp extends AppCompatActivity {

    int duration;
    Button loginBtn;
    EditText usern;
    EditText pass;
    String usernMessage;
    String passMessage;
    CharSequence text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
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

        loginBtn = (Button)findViewById(R.id.loginButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usern = (EditText)findViewById(R.id.username);
                EditText pass = (EditText)findViewById(R.id.password);

                String usernMessage = usern.getText().toString();
                String passMessage = pass.getText().toString();


                Context context = getApplicationContext();
                CharSequence text = "Username:" + usernMessage+ " " + "Password:"+passMessage;
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

             }
        });



    }

}
