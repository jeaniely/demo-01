package com.neuedu.object.encapsulation;

public class Person {
    private int height;
    private int weight;
    public Person(){}//构造器：特殊的方法：没有返回值，使用类名作为方法名；
       // public Person(){}默认
    public Person(int height,int weight){
        this();//构造器
        this.height=height;
        this.weight=weight;//this:本类的对象
    }
    public void print(){
        System.out.println("身高："+height+",体重"+weight);
    }
}
