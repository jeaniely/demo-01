package com.neuedu.systemobject.thread.example;

import java.util.Hashtable;

public class TestRunnable {
    public static void main(String[] args) {
        MyRunableExample runableExample=new MyRunableExample();
        Thread thread=new Thread(runableExample,"t1");
        Thread thread2=new Thread(runableExample,"t2");
        Thread thread3=new Thread(runableExample,"t3");
        Thread thread4=new Thread(runableExample,"t4");
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
