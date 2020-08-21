package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity003 extends AppCompatActivity {

    private Button sendMassage;
    //声明 获取验证码 按钮
    private Button nextOne1;
    //声明 下一步 按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage_prove);
        //找到 获取验证码 按钮
        sendMassage=findViewById(R.id.sendMassage);
        nextOne1=findViewById(R.id.nextOne);
        //找到 下一步 按钮
        nextOne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击下一步 跳转到页页面4 发送短信跳转页面
                Intent intent=new Intent(Activity003.this,Activity004.class);
                startActivity(intent);
            }
        });
    }
}
