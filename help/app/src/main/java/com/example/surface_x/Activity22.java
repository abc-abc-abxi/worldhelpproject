package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity22 extends AppCompatActivity {

    private Button btn_name22;
    //声明 昵称  按钮（可以设置点击跳转到 个人资料页面  ）
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);
        btn_name22=findViewById(R.id.btn_name_22);
        //找到  昵称 按钮
    }
}
