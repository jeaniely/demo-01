package com.neuedu.systemobject.sql.util;

import java.sql.*;

public class SqlUtil {

    //加载驱动
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 连接数据库
    public static Connection getConn() throws SQLException {
        String url="jdbc:mysql://192.168.189.132:3306/studentinfo";
        String username="root";
        String password="123456";

        Connection connection= DriverManager.getConnection(url,username,password);
        return connection;
    }

    public static void insertPreparedStatement(PreparedStatement psmt,Object ...objects) throws SQLException {
        if(objects!=null&& objects.length>0) {
            for(int i=0;i<objects.length;i++){
                psmt.setObject(i+1,objects[i]);
            }
        }

    }


    //关闭

    /**
     *  使用不定长度的数组--可变数组
     * @param objects
     */
    public static void close(Object ...objects){
        if(objects!=null&& objects.length>0){
            try {
                for (Object obj : objects) {
                    if (obj != null) {
                        if (obj instanceof Connection) {//判断obj是否时Connection对象
                            ((Connection) obj).close();//转为connection 对象，进行关闭
                        }
                        if (obj instanceof Statement) {//判断obj是否时 Statement对象
                            ((Statement) obj).close();//转为 Statement对象，进行关闭
                        }
                        if (obj instanceof ResultSet) {//判断obj是否时ResultSet对象
                            ((ResultSet) obj).close();//转为 ResultSet对象，进行关闭
                        }


                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }
}
