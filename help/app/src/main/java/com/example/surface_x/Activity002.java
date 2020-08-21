package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity002 extends AppCompatActivity {

    private Button textMessage;//短信验证按钮声明
    private Button problemProve;//密保问题验证按钮声明
    //声明页面二中的 两个Button 按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_002);

        textMessage=findViewById(R.id.btn_05);
        //找到 短信验证 按钮
        problemProve=findViewById(R.id.btn_06);
        //找到 密保问题验证 按钮
        textMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击短信验证按钮 跳转到界面3 短信验证跳转界面
                Intent intent=new Intent(Activity002.this,Activity003.class);
                startActivity(intent);
            }

        });
        problemProve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击密保问题验证按钮 跳转到界面5 密保问题界面
                Intent intent=new Intent(Activity002.this,Activity005.class);
                startActivity(intent);
            }
        });
    }
}
