package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity018 extends AppCompatActivity {

    private Button btn_name18;
    //声明页面18中的 name 昵称 按钮 （可以设置跳转到个人资料修改界面）
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_18);
        btn_name18=findViewById(R.id.btn_name_18);
        //找到页面18的 1个button 昵称 按钮
    }
}
