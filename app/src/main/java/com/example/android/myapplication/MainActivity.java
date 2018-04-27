package com.example.android.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is the standard NavBar Activity Code

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //This is where i edited the file , i added a font named overflow and changed the font here.

        textView = (TextView) findViewById(R.id.summer);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface);
        textView = (TextView) findViewById(R.id.spring);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface1);
        textView = (TextView) findViewById(R.id.rainy);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface2);
        textView = (TextView) findViewById(R.id.winter);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/OvertheRainbow.ttf");
        textView.setTypeface(typeface3);

        // Here i have assigned buttons to the texts so that coreeseponding next activity should open

        Button Summer = findViewById(R.id.summer);
        Summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Summerdestinations.class);
                startActivity(intent);

            }
        });
        Button Spring = findViewById(R.id.spring);
        Spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, springdestination.class);
                startActivity(intent);

            }
        });
        Button Rain = findViewById(R.id.rainy);
        Rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, rainy.class);
                startActivity(intent);

            }
        });
        Button Winter = findViewById(R.id.winter);
        Winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, winter.class);
                startActivity(intent);

            }
        });


    }

    //Again Standard NavBar code , i did nothing here
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //Here i have edited the navigation bar , and assigned what should the buttons do.


        if (id == R.id.summericon) {
            Intent intent = new Intent(MainActivity.this, Summerdestinations.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.springicon) {
            Intent intent = new Intent(MainActivity.this, springdestination.class);
            startActivity(intent);
        } else if (id == R.id.rainyicon) {
            Intent intent = new Intent(MainActivity.this, rainy.class);
            startActivity(intent);
        } else if (id == R.id.Wintericon) {
            Intent intent = new Intent(MainActivity.this, winter.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        //Again , Standard Code , nothing changed here

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
