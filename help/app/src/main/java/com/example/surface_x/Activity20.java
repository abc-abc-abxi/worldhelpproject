package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity20 extends AppCompatActivity {

    private Button mBt20_1;
    //声明 名字 （点击昵称可以设置跳转） 按钮
    private Button mBt20_2;
    //声明 性别 按钮
    private Button mBt20_3;
    //找到 出入日期 按钮
    private Button mBt20_4;
    //找到 身份证号码 按钮
    private Button mBt20_5;
    //找到 真实姓名 按钮
    private Button mBt20_6;
    //找到 确认 按钮
    private ImageView mBt20_7;
    //声明头像图片按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);
        mBt20_1=findViewById(R.id.btn_name_20);
        //找到 名字 （点击昵称可以设置跳转） 按钮
        mBt20_2=findViewById(R.id.buttonSex);
        //找到 性别 按钮
        mBt20_3=findViewById(R.id.btnBornDay);
        //找到 出入日期 按钮
        mBt20_4=findViewById(R.id.btnIdNumber);
        //找到 身份证号码 按钮
        mBt20_5=findViewById(R.id.btnTureName);
        //找到 真实姓名 按钮
        mBt20_6=findViewById(R.id.dtMine);
        //找到 确认 按钮
        mBt20_7=findViewById(R.id.img_Personal);
        //找到 头像图片 按钮
    }
}
