package com.neuedu.systemobject.thread.example;

public class MyRunableExample implements  Runnable {
    static int n=20;
    @Override
    public   void  run() {//public   synchronized void  run() 方法中添加


        while (n > 0) {
            synchronized(this) {//代码块
                if(n>0) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + (n--) + "票数");
                }

            }
            try {
                Thread.sleep(500);//1s=1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
