package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class mine1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine1);
        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
        BottomNavigationHelper.setupBottomNavigation(bottomNavView, this);
    }
}