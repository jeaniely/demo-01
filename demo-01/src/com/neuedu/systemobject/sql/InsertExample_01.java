package com.neuedu.systemobject.sql;

import com.neuedu.systemobject.sql.util.SqlUtil;

import java.sql.*;

public class InsertExample_01 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement pstm=null;
       int i=-1;

        try {
            connection= SqlUtil.getConn();
            String sql="insert into student(sname,ssex,sbirth,createtime,updatetime)\n" +
                    "values(?,?,?,?,?)";//?占位符
            pstm=connection.prepareStatement(sql);
           /* pstm.setObject(1,"neinei");
            pstm.setObject(2,0);
            pstm.setObject(3,"1996-09-10");
            pstm.setObject(4,new Timestamp((new java.util.Date()).getTime()));
            pstm.setObject(5,new Timestamp((new java.util.Date()).getTime()));*/
           SqlUtil.insertPreparedStatement(pstm,"neinei",0,"1998-05-08",new Timestamp((new java.util.Date()).getTime()),new Timestamp((new java.util.Date()).getTime()));
           i= pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(pstm,connection);
        }
        System.out.println("影响的行数为："+i);
    }
}
