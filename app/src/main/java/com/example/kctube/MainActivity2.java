package com.example.kctube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView vVIEW= (VideoView) findViewById(R.id.vVIEW);
        vVIEW.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vdeo);

        //NOW TO MAKE MEDIA CONTROLLER WE CREATE AN OBJECT, THEN
        MediaController mediaController=new MediaController(this);
        vVIEW.setMediaController(mediaController);
        mediaController.setAnchorView(vVIEW);

        vVIEW.start();
    }
}