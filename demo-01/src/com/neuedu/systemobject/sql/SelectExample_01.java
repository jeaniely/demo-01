package com.neuedu.systemobject.sql;

import java.sql.*;

public class SelectExample_01 {
    /**
     * 查询：查询全部
     * @param args
     */
    public static void main(String[] args) throws SQLException {
         //1：加载驱动-- 通过反射的形式进行加载
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //2:连接数据库
        //1:使用jdbc进行连接
        //2：连接的时mysql数据库
        //3：数据库的地址：ip地址：端口号/数据库名
        String url="jdbc:mysql://192.168.189.132:3306/studentinfo";
        String username="root";
        String password="123456";

        Connection connection= DriverManager.getConnection(url,username,password);
        System.out.println(connection);

        //3：执行sql语句，生产PreparedStatement对象
        String sql="select sid,sname,ssex from student";
        PreparedStatement psmt=connection.prepareStatement(sql);
        //4：结果
       ResultSet rs= psmt.executeQuery();
       while(rs.next()){
           System.out.println(rs.getObject(1)+"  "+rs.getObject("sname"));
       }

       rs.close();
       psmt.close();
       connection.close();

    }
}
