package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationHelper {

    public static void setupBottomNavigation(BottomNavigationView bottomNavView, AppCompatActivity activity) {
        // 设置底部导航栏的监听器
        bottomNavView.setOnItemSelectedListener(item -> {

            if(item.getItemId()==R.id.navigation_home){
                // 点击首页按钮，跳转到首页 Activity
                Intent homeIntent = new Intent(activity, home.class);
                activity.startActivity(homeIntent);
                return true;}
            else if(item.getItemId()==R.id.navigation_bill){
                // 点击账单按钮，跳转到账单 Activity
                Intent billIntent = new Intent(activity, bill.class);
                activity.startActivity(billIntent);
                return true;}
            else if(item.getItemId()==R.id.navigation_mine){
                // 点击我的按钮，跳转到我的 Activity
                Intent mineIntent = new Intent(activity, mine1.class);
                activity.startActivity(mineIntent);
                return true;}
            else
                return false;

        });
    }
}