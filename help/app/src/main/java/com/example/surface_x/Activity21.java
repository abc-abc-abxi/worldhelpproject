package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity21 extends AppCompatActivity {

    private Button btnName21;
    //声明 昵称  按钮（可以设置点击跳转到 个人资料页面  ）
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
        btnName21=findViewById(R.id.btn_name_21);
        //找到  昵称 按钮
    }
}
