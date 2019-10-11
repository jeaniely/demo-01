package com.neuedu.systemobject.sql.dao;

import com.neuedu.systemobject.sql.dao.dao.StudentDAO;
import com.neuedu.systemobject.sql.dao.dao.impl.StudentDAOImpl;
import com.neuedu.systemobject.sql.dao.javabean.Student;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentDAO dao=new StudentDAOImpl();
       /* System.out.println(dao.delete(16));*/
        List<Student> list=dao.getAll();
        System.out.println(list);

    }
}
