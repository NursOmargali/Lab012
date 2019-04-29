package com.example.lab1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChangeImage extends AppCompatActivity {

    ImageView myImageView;
    Button myButton;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);
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

        myImageView = (ImageView)findViewById(R.id.image_view);
        myButton = (Button)findViewById(R.id.my_button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageView.setImageResource(R.drawable.cat);
                myImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                i++;
                if (i%2==0){
                    myImageView.setImageResource(R.drawable.dog);
                    myImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }

                System.out.println(i);
            }
        });

    }




}
