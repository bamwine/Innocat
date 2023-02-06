package com.innocat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        setTitle("");

        Handler timer = new Handler();

        Runnable r = new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(Home.this, MainActivty.class));


            }
        };

        timer.postDelayed(r, 3000);

            }
}
