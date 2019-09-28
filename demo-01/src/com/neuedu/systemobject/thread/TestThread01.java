package com.neuedu.systemobject.thread;

public class TestThread01 {
    public static void main(String[] args) {
        MyThead01 myThead01=new MyThead01();
        myThead01.start();//开启线程
      // myThead01.run();
        for(int i=0;i<10;i++){
            System.out.println("main的数据"+i);
        }
    }
}
