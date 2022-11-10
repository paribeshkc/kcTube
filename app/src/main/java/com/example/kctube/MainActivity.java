package com.example.kctube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void videoLaunch(View view){
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }

    public void musicLaunch(View view){
        Intent i=new Intent(this,MainActivity3.class);
        startActivity(i);
    }

}