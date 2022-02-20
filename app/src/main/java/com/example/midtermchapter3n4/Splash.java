package com.example.midtermchapter3n4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this,MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.splash,menu);
//        return true;
//
//
//    }
}