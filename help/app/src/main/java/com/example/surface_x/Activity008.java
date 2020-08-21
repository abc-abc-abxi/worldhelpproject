package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity008 extends AppCompatActivity {
    private Button btnSinglePointTask;//声明 单点任务 按钮变量
    private Button btnMultiPointTask;//声明 多点任务 按钮变量
    private Button btnPeriodicTask;//声明 周期任务 按钮变量
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_008);
        //按钮赋值
        btnSinglePointTask = findViewById(R.id.btnSinglePointTask);
        btnMultiPointTask = findViewById(R.id.btnMultiPointTask);
        btnPeriodicTask = findViewById(R.id.btnPeriodicTask);
        //按钮点击页面跳转
        //单点任务 按钮 点击监听
        btnSinglePointTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity008.this, Activity009.class);
                startActivity(intent);
            }

        });
        //多点任务 按钮 点击监听
        btnMultiPointTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity008.this, Activity009.class);
                startActivity(intent);
            }

        });
        //周期任务 按钮 点击监听
        btnPeriodicTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity008.this, Activity009.class);
                startActivity(intent);
            }

        });
    }
}