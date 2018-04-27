package com.example.android.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class winter extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);
        //changed font

        textView = (TextView) findViewById(R.id.winter_destination1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface);
        textView = (TextView) findViewById(R.id.winter_destination2);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface1);
        //**
        // here i have assigned button for first winter destination in our app ,
        //i created a a new activity and java class named winter_austria and added a view pager and a custom layout
        // using view pager adapter i inflated custom layout with relevant text and images**//
        // similar procedure should be followed for other destinations too
        // **//
        Button winter1 = findViewById(R.id.winter_destination1);
        winter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(winter.this, winter_austria.class);
                startActivity(intent);
            }
        });
    }
}
