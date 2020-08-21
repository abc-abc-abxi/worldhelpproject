package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity017 extends AppCompatActivity {
    private Button btn_01701;
    //声明 名字 （点击昵称可以设置跳转） 按钮
    private Button btn_01702;
    //声明 积分 按钮（可以设置点击跳转到 积分页面）
    private Button btn_01703;
    //声明 信誉积分按钮 （可以设置点击跳转到 信誉积分详情页面）
    private Button btn_01704;
    //声明 历史记录按钮
    private Button btn_01705;
    //声明 资料修改完善按钮 点击可以跳转 资料完善页面（页面20）
    private Button btn_01706;
    //声明 积分充值按钮  点击可以进入积分充值页面
    private Button btn_01707;
    //声明 密码修改按钮 点击可以跳转到密码修改页面
    private Button btn_01708;
    //声明 好友列表按钮 点击可以进入到关注的人界面 （页面21）
    private Button btn_01709;
    //声明 切换账号按钮
    private Button btn_01710;
    //声明 退出登录按钮
    private Button btn_01711;
    //声明  附近的人按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_017);
        btn_01701=findViewById(R.id.btn_name_17);
        //找到 名字 （点击昵称可以设置跳转） 按钮
        btn_01702=findViewById(R.id.btnPoints);
        //找到 积分 按钮（可以设置点击跳转到 积分页面）
        btn_01703=findViewById(R.id.btn_credit);
        //找到 信誉积分按钮 （可以设置点击跳转到 信誉积分详情页面）
        btn_01705=findViewById(R.id.btnFixData);
        //找到 资料修改完善按钮 点击可以跳转 资料完善页面（页面20）
        btn_01706=findViewById(R.id.btnRecharge);
        //找到  积分充值按钮  点击可以进入积分充值页面
        btn_01707=findViewById(R.id.btnChangePassword);
        //找到 密码修改按钮 点击可以跳转到密码修改页面
        btn_01708=findViewById(R.id.friendList);
        //找到 好友列表按钮 点击可以进入到关注的人界面 （页面21）
        btn_01709=findViewById(R.id.btnChangeAccount);
        //找到 切换账号按钮
        btn_01710=findViewById(R.id.btn_BackHome);
        //找到 退出登录按钮
        btn_01704=findViewById(R.id.btnHistory);
        //找到历史记录按钮
        btn_01711=findViewById(R.id.btnNearPeple);
        //找到 附近的人按钮

        btn_01704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击历史记录按钮  跳转到页面 18 历史记录页面
                Intent intent = new Intent(Activity017.this, Activity018.class);
                startActivity(intent);
            }
        });
        btn_01705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击资料完善按钮 跳转到页面20 修改资料完善 页面
                Intent intent = new Intent(Activity017.this, Activity20.class);
                startActivity(intent);
            }
        });
        btn_01708.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //关注的人按钮 点击可以 跳转到页面21 关注的人 页面
                Intent intent = new Intent(Activity017.this, Activity21.class);
                startActivity(intent);
            }
        });
        btn_01711.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击附近的人按钮 跳转到页面 22附近的人页面
                Intent intent = new Intent(Activity017.this, Activity22.class);
                startActivity(intent);
            }
        });
    }
}
