package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import android.content.Intent;
import android.os.Bundle;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取底部导航栏
        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
        BottomNavigationHelper.setupBottomNavigation(bottomNavView, this);

        // 设置底部导航栏的监听器

    }
}