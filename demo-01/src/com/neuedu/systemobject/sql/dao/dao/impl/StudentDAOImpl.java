package com.neuedu.systemobject.sql.dao.dao.impl;

import com.neuedu.systemobject.sql.dao.dao.StudentDAO;
import com.neuedu.systemobject.sql.dao.javabean.Student;
import com.neuedu.systemobject.sql.util.ModifyUtil;
import com.neuedu.systemobject.sql.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public List<Student> getAll() {
        Connection connection=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        List<Student> liststudent=new ArrayList<>();
        try {
            connection= SqlUtil.getConn();
            String sql="select sid,sname,ssex from student";
            pstm=connection.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next()){
               Student student=new Student();
               student.setSid(rs.getInt("sid"));
                student.setSname(rs.getString("sname"));
                student.setSsex(rs.getInt("ssex"));

                liststudent.add(student);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(rs,pstm,connection);
        }

        return liststudent;
    }

    @Override
    public boolean delete(int sid) {
        String sql="delete from student where sid=?";
        int i= ModifyUtil.modify(sql,sid);
        if(i==-1){
            return false;
        }
        return true;
    }
}
