package com.neuedu.systemobject.sql;

import com.neuedu.systemobject.sql.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DeleteInsertExample {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement pstm1=null;
        PreparedStatement pstm2=null;
        int i=-1;

        try {
            connection= SqlUtil.getConn();
            connection.setAutoCommit(false);//关闭自动提交，开启手动提交

            String sql="insert into student(sname,ssex,sbirth,createtime,updatetime)\n" +
                    "values(?,?,?,?,?)";//?占位符
            pstm1=connection.prepareStatement(sql);
            SqlUtil.insertPreparedStatement(pstm1,"neinei",0,"1998-05-08",new Timestamp((new java.util.Date()).getTime()),new Timestamp((new java.util.Date()).getTime()));
             pstm1.executeUpdate();

            String deletesql="delete from student  sid=?";
            pstm2 =connection.prepareStatement(deletesql);
            SqlUtil.insertPreparedStatement(pstm2,11);
            pstm2.executeUpdate();
            System.out.println("上述两条语句没有问题，进行提交");
            connection.commit();


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("上述两条语句有问题，进行回滚");
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            SqlUtil.close(pstm1,pstm2,connection);
        }
    }
}
