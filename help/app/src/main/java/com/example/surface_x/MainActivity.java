package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnEnter;
    //声明 登录 按钮
    private Button mBtFindPassword;
    //找到 忘记密码 按钮
    private Button newRegister;
    //找到 新用户注册 按钮
    private Button mBtLogin;
    //声明 点击登陆时的 toast 提示 按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnEnter = findViewById(R.id.btn_01);
        //找到 登录 按钮
        mBtFindPassword = findViewById(R.id.btn_03);
        //找到 忘记密码 按钮
        newRegister = findViewById(R.id.btn_04);
        //找到 新用户注册 按钮
        mBtLogin = findViewById(R.id.btn_01);
       //找到 声明的 toast 提示按钮 

        mBtFindPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击忘记密码按钮 跳转到界面  忘记密码
                Intent intent = new Intent(MainActivity.this, Activity002.class);
                startActivity(intent);
            }
        });
        newRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击新用户注册按钮 跳转到页面  新用户注册
                Intent intent = new Intent(MainActivity.this, Activity006.class);
                startActivity(intent);
            }
        });
        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置的一个toast提示，点击 登录按钮时候会提示 登录成功字样
                Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
            }
        });

    }

    }

