package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill);
        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
        BottomNavigationHelper.setupBottomNavigation(bottomNavView, this);
    }
}