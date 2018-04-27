package com.example.android.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this java class represents list of activities inside summer

public class Summerdestinations extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summerdestinations);

        //changed font

        textView = (TextView) findViewById(R.id.summer_destination1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface);
        textView = (TextView) findViewById(R.id.summer_destination2);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface1);
        textView = (TextView) findViewById(R.id.summer_destination3);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface2);
        textView = (TextView) findViewById(R.id.summer_destination4);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface3);
        textView = (TextView) findViewById(R.id.summer_destination5);
        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface3);
        textView = (TextView) findViewById(R.id.summer_destination6);
        Typeface typeface5 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface3);

        //**
        // here i have assigned button for first summer destination in our app ,
        //i created a a new activity and java class named hawaii and added a view pager and a custom layout
        // using view pager adapter i inflated custom layout with relevant text and images**//
        // similar procedure should be followed for other destinations too
        // **//


        Button Hawai = findViewById(R.id.summer_destination1);
        Hawai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Summerdestinations.this, hawaii.class);
                startActivity(intent);
            }
        });
    }
}
