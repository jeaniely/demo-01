package com.neuedu.object.example;

public class Oracle implements JDBC {
    @Override
    public void connection() {
        System.out.println("使用oracle进行数据库连接");
    }

    @Override
    public void execute() {
        System.out.println("使用oracle进行执行");
    }

    @Override
    public void result() {
        System.out.println("使用oracle进行结果处理");
    }
}
