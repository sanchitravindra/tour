package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class startscreen extends AppCompatActivity {
    //defined a timer
Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);

        //following code allows a activity to function as a start screen the delay to move on to next activity i.e our main activity is kept 2.5sec i.e 2500
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(startscreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2500);
    }
}
