package com.example.android.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class winter_austria extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter_austria);
//Connecting ViewPager from xml
        viewPager = (ViewPager) findViewById(R.id.austria);
        austriaadapter austriaadapter = new austriaadapter(this);
        viewPager.setAdapter(austriaadapter);
    }
}
