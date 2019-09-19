package com.neuedu.systemobject.list01;

import java.util.ArrayList;
import java.util.List;

public class ListExample_02 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student student=new Student();
        student.setSid(112);
        student.setSname("tom");
        student.setSex(1);
        student.setSbirth(StringToDATE.getDateFromString("1993-04-09"));
        list.add(student);
        Student student1=new Student();
        student1.setSid(113);
        student1.setSname("lili");
        student1.setSex(0);
        student.setSbirth(StringToDATE.getDateFromString("1992-08-09"));
        list.add(student1);

        System.out.println(list);
        System.out.println("=========================");
        for (Student s:list ) {
            System.out.println(s);
        }



    }
}
