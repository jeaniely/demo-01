package com.neuedu.systemobject.sql;

import com.neuedu.systemobject.sql.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DeleteExample_01 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement pstm=null;
        int i=-1;

        try {
            connection= SqlUtil.getConn();
            String sql="delete from student where sid=?";//?占位符
            pstm=connection.prepareStatement(sql);

            SqlUtil.insertPreparedStatement(pstm,12);
            i= pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(pstm,connection);
        }
        System.out.println("影响的行数为："+i);
    }
    }

