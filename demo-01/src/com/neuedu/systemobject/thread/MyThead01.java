package com.neuedu.systemobject.thread;

public class MyThead01 extends Thread {
    //1：继承Thread
    //2：i
    @Override
    public void run() {
       for(int i=0;i<10;i++){
           System.out.println("线程中的数据"+i);
       }
    }
}
