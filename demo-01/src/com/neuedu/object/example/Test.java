package com.neuedu.object.example;

public class Test {
    public static void main(String[] args) {
        JDBC jdbc=Factory.create("oracle");
        jdbc.connection();
        jdbc.execute();
        jdbc.result();
    }
}
