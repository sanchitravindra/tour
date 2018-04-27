package com.example.android.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class yoshemite extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoshemite);

//Connecting ViewPager from xml

        viewPager = (ViewPager) findViewById(R.id.yoshimite);
        yoshimiteadapter yoshimiteadapter = new yoshimiteadapter(this);
        viewPager.setAdapter(yoshimiteadapter);
    }
}
