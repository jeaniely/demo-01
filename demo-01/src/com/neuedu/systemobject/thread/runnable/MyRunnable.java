package com.neuedu.systemobject.thread.runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            //Thread.currentThread().getName()
            //public static native Thread currentThread();//得到当前的线程使用类来调用
            // 当前线程的名字，使用getName();

            System.out.println(Thread.currentThread().getName()+"线程中的数据"+i);
        }
    }
}
