package com.neuedu.systemobject.sql;

import com.neuedu.systemobject.sql.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExample_02 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;

        try {
            connection= SqlUtil.getConn();
            String sql="select sid,sname,ssex from student";
            pstm=connection.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next()){
                System.out.println(rs.getObject(1)+"  "+rs.getObject("sname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(rs,pstm,connection);
        }


    }
}
