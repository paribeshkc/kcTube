package com.example.kctube;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        player=MediaPlayer.create(this,R.raw.music);
    }
    public void play(View view){
        player.start();
    }

    public void pause(View view){
    player.pause();
    }

    public void stop(View view){
    player.stop();
    }


}