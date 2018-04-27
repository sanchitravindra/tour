package com.example.android.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class rain_destination_1 extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_destination_1);

        //Connecting ViewPager from xml

        viewPager = (ViewPager) findViewById(R.id.rain_destination_1);
        rain_destination_1_adapter rain_destination_1_adapter = new rain_destination_1_adapter(this);
        viewPager.setAdapter(rain_destination_1_adapter);
    }
}
