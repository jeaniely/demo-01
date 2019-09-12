package com.neuedu.object.example;

public class Mysql implements JDBC {
    @Override
    public void connection() {
        System.out.println("使用MySQL进行连接");
    }

    @Override
    public void execute() {
        System.out.println("使用MySQL进行执行");
    }

    @Override
    public void result() {
        System.out.println("使用MySQL进行结果的处理");
    }
}
