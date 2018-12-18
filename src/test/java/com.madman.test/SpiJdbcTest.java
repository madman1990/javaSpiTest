package com.madman.test;

import java.sql.*;

public class SpiJdbcTest {
    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://127.0.0.1:3306/ry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String USER = "root";
            String PASSWORD = "aaa111";
            //1.加载驱动程序
           // Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库链接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from sys_user");
            //4.处理数据库的返回结果(使用ResultSet类)
            while (rs.next()) {
                System.out.println(rs.getString("user_id") + 26 + rs.getString("login_name"));
            }
            //关闭资源
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        }
    }
}
