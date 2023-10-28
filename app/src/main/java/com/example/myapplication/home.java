package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import android.os.Bundle;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

         BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
         BottomNavigationHelper.setupBottomNavigation(bottomNavView, this);

    }
}