package com.neuedu.object.inherit.first;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        person.setHeight(180);
        person.setWeight(88);

        System.out.println(person.getHeight()+"  "+person.getWeight());

        Student student=new Student();
        student.setHeight(175);
        student.setWeight(69);
        student.setScore(89);
        System.out.println(student.getHeight()+"    "+student.getWeight()+" "+student.getScore());
    }
}
