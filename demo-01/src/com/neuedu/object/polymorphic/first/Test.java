package com.neuedu.object.polymorphic.first;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.eat();
        Animal animal1=new Cat();
        animal1.eat();
    }
}
