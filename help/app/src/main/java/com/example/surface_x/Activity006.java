package com.example.surface_x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.surface_x.SQL.Util_Druid;
import com.example.surface_x.SQL.informationadd;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;


public class Activity006 extends AppCompatActivity {

    private Button mBtDetermine;
    //声明 注册 按钮
    private Button mBtCodeProve;
    //声明 获取验证码 按钮
    private Button mBtPicProve;
    //声明页面6中 获取图片验证码 按钮

    private EditText id; //手机号

    private EditText username;//昵称

    private EditText sex;//性别

    private EditText date;//出生年月

    private EditText password;//密码

    private EditText password2;//再次输入密码

    //封装类 存放的是用户信息
    private informationadd informat = new informationadd();

    //JdbcTemplate 进行增删改,Util_Druid.getDataSource()传入的是数据库连接池对象
    private JdbcTemplate temp = new JdbcTemplate(Util_Druid.getDataSource());


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
        id=findViewById(R.id.qusetion001);//手机号
        username=findViewById(R.id.quesetion02);//昵称
        sex=findViewById(R.id.quesetion03);//性别
        date=findViewById(R.id.quesetion04);//出生年月
        password=findViewById(R.id.quesetion05);//密码
        password2=findViewById(R.id.quesetion06);//再次密码

        mBtDetermine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count1=SetUser();//返回封装到类的结果
                int count2 =InsertUser();//返回加入数据库表的结果
                if (count1==0){
                    Toast.makeText(Activity006.this, "失败", Toast.LENGTH_SHORT).show();
                }
                //如果返回结果大于0,说明添加数据库成功,跳转到界面 17 “我的界面”,否则给出提示
                if(count2>0){
                    Intent intent = new Intent(Activity006.this, Activity017.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Activity006.this, "失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //先将用户的信息存储到 封装类里
    public int SetUser(){
        int i=0;
        try { //转型将String转型到int.如果输入的不是数字类型的就提示

            i = Integer.parseInt(id.getText().toString());
            String sql = "select * from userhelp where id = ?";
            Map<String, Object> map = temp.queryForMap(sql,i);

            if (map==null) {//查询数据库中有没有相同的手机号,没有就放入数据库中
                informat.setId(i);//手机号放入封装类
            }else {
                Toast.makeText(Activity006.this,"已存在此手机号,请登录",Toast.LENGTH_SHORT).show();
                return 0;
            }

        }catch (Exception e){
            Toast.makeText(Activity006.this,"请输入正确的数字",Toast.LENGTH_SHORT).show();
            return 0;
        }

        informat.setUsername(username.getText().toString());//将昵称放入封装类中
        informat.setSex(sex.getText().toString());//将性别放入封装类
        informat.setDate(date.getText().toString());

        //判断第一次输入密码和第二次输入密码是否相同,相同就加入类中,不同就提示
        if (password.getText().equals(password2.getText())) {
            informat.setPassword(password.getText().toString());
        }else {
            Toast.makeText(Activity006.this, "密码不一样", Toast.LENGTH_SHORT).show();
            return 0;
        }

        return 1;
    }

    //将设置好的封装类加入数据库表中
    public int InsertUser(){

        String sql = "insert  into stu (id,name,sex,date,password) values (?,?,?,?,?)";
        int update = temp.update(sql, informat.getId(), informat.getUsername(), informat.getSex(), informat.getDate(), informat.getPassword());
        return update;//返回执行条数
    }
}
