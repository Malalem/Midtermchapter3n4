package com.example.midtermchapter3n4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {
    Button b1,b2;
    MediaPlayer mp1,mp2;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
       b1 = (Button) findViewById(R.id.button3);
       b2 = (Button) findViewById(R.id.button4);
       b1.setOnClickListener(music1);
       b2.setOnClickListener(music2);
       mp1 = new MediaPlayer();
       mp1 = MediaPlayer.create(this,R.raw.track1);
       mp2 = new MediaPlayer();
       mp2 = MediaPlayer.create(this,R.raw.track2);
    }
    Button.OnClickListener music1 = new Button.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (playing) {
                case 0:
                    mp1.start();
                    playing = 1;
                    b1.setText("Pause song");
                    //b1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mp1.pause();
                    playing = 0;
                    b1.setText("Play Song");
                    //b1.setVisibility(View.VISIBLE);
                    break;
            }
        }


    };
    Button.OnClickListener music2 = new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (playing){
                case 0:
                    mp2.start();
                    playing=1;
                    b2.setText("Pause song");
                    //b2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mp2.pause();
                    playing = 0;
                    b2.setText("Play Song");
                    //b2.setVisibility(View.VISIBLE);
                    break;
            }

        }
    };
}