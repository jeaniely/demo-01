package com.neuedu.object.static01;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.print();
        System.out.println(Person.num);
        Person person2=new Person();
        person2.print();
        Person person3=new Person();
        person3.print();
    }
}
