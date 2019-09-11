package com.neuedu.object.encapsulation;

public class PersonCreate {
    public static void main(String[] args) {
       /* Person person=new Person(189,200);
        person.print();*/
       PersonSetGet person=new PersonSetGet();
       person.setHeight(189);
       person.setWeight(180);
        System.out.println("身高："+person.getHeight()+",体重"+person.getWeight());
    }
}
