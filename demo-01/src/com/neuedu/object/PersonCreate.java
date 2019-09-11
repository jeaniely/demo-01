package com.neuedu.object;

public class PersonCreate {
    public static void main(String[] args) {
        Person person=new Person();
        person.height=189;
        person.weight=200;
        System.out.println("身高"+person.height);
        System.out.println("体重"+person.weight);
        person.jump();
    }
}
