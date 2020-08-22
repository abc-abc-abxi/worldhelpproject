package com.example.surface_x.SQL;

import android.util.Log;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/**
 * 工具类实现注册 配置文件 和 返回数据库连接对象
 */


public class Util_demo {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    //静态代码块 在加载类时候就执行一次
    static {

        Log.d("------目前这个类没啥用--------","这是我第二种测试加载配置文件的方法,没用连接池依然报错");
        //使用加载配置文件方式
        try {
            Properties pro = new Properties();
            //1读取配置文件绝对地址
//            pro.load(new FileReader("E:\\repository\\worldhelpproject\\help\\app\\src\\jdbc1.properties"));
            InputStream in = Util_demo.class.getClassLoader().getResourceAsStream("jdbc1.properties");
            pro.load(in);
            //2传入数据
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //3注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接数据库
     * @return
     */
    public static Connection getconnection() throws SQLException {
        return  DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * @param conn
     * @param state
     * @param result
     */
    public static void close(Connection conn, Statement state , ResultSet result){
        if (result != null){
            try {
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else Log.d("Util_demo:","result 为空");
        if (state != null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else Log.d("Util_demo:","state 为空");
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else Log.d("Util_demo:","conn 为空");

    }
}
