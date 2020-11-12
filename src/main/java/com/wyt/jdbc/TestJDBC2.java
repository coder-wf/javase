package com.wyt.jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


 
public class TestJDBC2 {
    public static void main(String[] args) {
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
 
            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 admin
 
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=UTF-8",
                            "root", "admin");
            
            System.out.println("连接成功，获取连接对象： " + c);
            
            Statement s = c.createStatement();
            
            System.out.println("获取 Statement对象： " + s);
            
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")"; 
            s.execute(sql);
  
            System.out.println("执行插入语句成功");
            
            
            
 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
