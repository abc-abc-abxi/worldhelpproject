package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity005 extends AppCompatActivity {

    private Button mBtDetermine;
    //声明页面5中的  确认  按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_005);
        mBtDetermine=findViewById(R.id.determine);
        //找到页面5中的 确认 按钮
    }
}
