package com.example.gitrepos.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gitrepos.R;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //noinspection deprecation
        getWindow().setStatusBarColor(getResources().getColor(R.color.darkGrey));
        Objects.requireNonNull(getSupportActionBar()).hide();

        Handler SplashScreenHandler = new Handler();
        SplashScreenHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent launchUserActivity = new Intent(SplashScreen.this, UserActivity.class);
                startActivity(launchUserActivity);
                finish();
            }
        }, 400);

    }
}
