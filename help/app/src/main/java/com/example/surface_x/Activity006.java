package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity006 extends AppCompatActivity {
    private Button mBtDetermine;
    //声明 注册 按钮
    private Button mBtCodeProve;
    //声明 获取验证码 按钮
    private Button mBtPicProve;
    //声明页面6中 获取图片验证码 按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_006);
        mBtDetermine=findViewById(R.id.dtMine);
        //找到 注册 按钮
        mBtCodeProve=findViewById(R.id.getVerificationCode);
        //找到 获取验证码 按钮
        mBtPicProve=findViewById(R.id.getPicProve);
        //找到 获取图片验证码 按钮

        mBtDetermine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击 注册按钮 跳转到界面 17 “我的界面”
                Intent intent = new Intent(Activity006.this, Activity017.class);
                startActivity(intent);
            }
        });
    }
}
