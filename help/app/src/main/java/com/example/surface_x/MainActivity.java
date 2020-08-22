package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainActivity extends AppCompatActivity {

    private Button mBtFindPassword;
    //找到 忘记密码 按钮
    private Button newRegister;
    //找到 新用户注册 按钮
    private Button mBtLogin;
    //声明 点击登陆时的 toast 提示 按钮

    private EditText id;//账号

    private EditText password;//密码


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtFindPassword = findViewById(R.id.btn_03);
        //找到 忘记密码 按钮
        newRegister = findViewById(R.id.btn_04);
        //找到 新用户注册 按钮
        mBtLogin = findViewById(R.id.btn_01);
       //找到 登录提示按钮

        id=findViewById(R.id.id000);//账号
        password=findViewById(R.id.password);//密码

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
//                Intent intent = new Intent(MainActivity.this, Activity006.class);
//                startActivity(intent);
            }
        });
        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (SelectId() == true){//如果在数据存在就登录成功
                    Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    //查找数据库是否存在手机号和密码
    public boolean SelectId(){
        Log.d("----------------------:","我没用Druid和JdbcTemplate 最初办法试了试 还是感觉jar包和idea出问题了");
        Connection conn = null;//数据库连接对象
        PreparedStatement pstate = null;//执行sql对象
        ResultSet result = null;//查询结果集
        int i = 0;
        try {
            Log.d("----------------------:","下面这句有问题");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Log.d("----------------------:","上面这句有问题,我感觉是配置出问题了");

            conn = DriverManager.getConnection("jdbc:mysql://223.104.227.132:3306/db1?serverTimezone=GMT%2B8","root","guolongkai@123");
            String sql = "select * from userhelp where id = ? and password = ? ";
            pstate = conn.prepareStatement(sql);//执行sql语句的对象
            //问号填写
            pstate.setInt(1,i);
            pstate.setString(2,password.getText().toString());
            result = pstate.executeQuery();

            //如果存在下一行就返回true
            return result.next();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstate != null){
                try {
                    pstate.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        try {//强制转型
            i=Integer.parseInt(id.getText().toString());
        }catch (Exception e){
            Toast.makeText(MainActivity.this,"账号请为数字",Toast.LENGTH_SHORT).show();
        }

        return false;
    }

}

