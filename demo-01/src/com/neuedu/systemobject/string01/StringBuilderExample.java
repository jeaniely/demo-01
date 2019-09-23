package com.neuedu.systemobject.string01;

import com.neuedu.systemobject.list01.StringToDATE;
import com.neuedu.systemobject.list01.Student;

public class StringBuilderExample {
    public static void main(String[] args) {
        Student student=new Student();
        student.setSid(112);
        student.setSname("lili");
        student.setSbirth(StringToDATE.getDateFromString("1999-04-01"));
        student.setSex(1);
        //将上面的学生信息，合并为字符串
        StringBuilder strb=new StringBuilder();
        strb.append(student.getSid()+",");
        strb.append(student.getSname());
        System.out.println(new String(strb));



    }
}
