package com.neuedu.systemobject.thread.runnable;

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        //Thread:
       /*
       * Thread()
`````````分配一个新的 Thread对象。
`````````Thread(Runnable target)
`````````分配一个新的 Thread对象。
`````````Thread(Runnable target, String name)
`````````分配一个新的 Thread对象
     *
       * */

        Thread thread=new Thread(runnable,"thread01");
        Thread thread2=new Thread(runnable,"thread02");
        thread.start();
        thread2.start();
    }
}
