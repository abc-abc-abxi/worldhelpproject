package com.example.surface_x;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity007 extends AppCompatActivity {

    private Button btnPublishTask;//声明 发布任务 按钮变量
    private Button btnAcceptTask;//声明 接受任务 按钮变量
    private Button btnPublishedAndAcceptedUnfinishedTask;//声明 已发布及接受未完成任务 按钮变量
    private ImageButton iBtnConcern;//声明 关注的人 按钮变量
    private ImageButton iBtnNearby;//声明 附近的人 按钮变量
    private ImageButton iBtnI;//声明 我 按钮变量
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_007);
        //按钮赋值
        btnPublishTask = findViewById(R.id.btnPublishTask);
        btnAcceptTask = findViewById(R.id.btnAcceptTask);
        btnPublishedAndAcceptedUnfinishedTask = findViewById(R.id.btnPublishedAndAcceptedUnfinishedTask);
        iBtnConcern = findViewById(R.id.iBtnConcern);
        iBtnNearby = findViewById(R.id.iBtnNearby);
        iBtnI = findViewById(R.id.iBtnI);
        //按钮点击页面跳转
        //发布任务 按钮 点击监听
        btnPublishTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity008.class);
                startActivity(intent);
            }

        });
        //接受任务 按钮 点击监听
        btnAcceptTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity010.class);
                startActivity(intent);
            }

        });
        //已发布及接受未完成任务 按钮 点击监听
        btnPublishedAndAcceptedUnfinishedTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity22.class);
                startActivity(intent);
            }

        });
        //关注的人 按钮 点击监听
        iBtnConcern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity21.class);
                startActivity(intent);
            }

        });
        //附近的人 按钮 点击监听
        iBtnNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity21.class);
                startActivity(intent);
            }

        });
        //我 按钮 点击监听
        iBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity007.this, Activity017.class);
                startActivity(intent);
            }

        });
    }
}