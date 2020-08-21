package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity004 extends AppCompatActivity {
    private Button completeSet;
    //声明页面4 完成 按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_004);
        completeSet=findViewById(R.id.setupComplete);
        //找到 页面4中的 Button 完成 按钮 completeSet
    }
}
