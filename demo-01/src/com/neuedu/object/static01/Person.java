package com.neuedu.object.static01;
/**
 * 使用static进行人数的统计
 * **/
public class Person {
    static  int num=0;
    int num2=0;

    public Person(){
        num++;
        num2++;
    }
    public void print(){
        System.out.println("现在人数："+num+"对象中的num："+num2);
    }
}
