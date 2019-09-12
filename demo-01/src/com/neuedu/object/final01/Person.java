package com.neuedu.object.final01;

public class Person {
    public final String NAME="zhangsan";

    public final void eat(){//不允许子类重写
        System.out.println("吃");
    }
    public void jump(final String tool){

        System.out.println("从"+tool+"开始跳");
    }

}
