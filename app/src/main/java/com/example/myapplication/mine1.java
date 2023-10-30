package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class mine1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine1);
        //底部导航栏
        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
        BottomNavigationHelper.setupBottomNavigation(bottomNavView, this);
        //个人信息界面跳转
        LinearLayout personal_info_management = findViewById(R.id.personl_info_management);
        personal_info_management.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), personal_info_management_activity.class);
                startActivity(intent);
            }
        });



    }
}