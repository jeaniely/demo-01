package com.neuedu.systemobject.thread.example01;
//生产销售模式

public class MyRunnable02 {
    static final Object obj=new Object();
    private static Boolean flag=false;

    public static void main(String[] args) {
        Input input=new Input();
        Output output=new Output();
        Thread inputThread=new Thread(input);
        Thread outputThread=new Thread(output);
        System.out.println(inputThread.getPriority());
        System.out.println(outputThread.getPriority());
        inputThread.start();
        outputThread.start();

    }

//买
    static class Input implements Runnable{

        @Override
        public void run() {
           synchronized (obj){
               System.out.println("销售模式：");
               System.out.println("flag="+flag);//false
               while(!flag){//没有东西可买，
                   try {
                       System.out.println("商品不足");
                       flag=true;
                       obj.wait();//等待

                       System.out.println("结束等待");
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("销售");

                   obj.notify();
               }

           }
        }
    }
    static class Output implements Runnable{

        @Override
        public void run() {
            synchronized (obj){
                System.out.println("生产模式：");
                System.out.println("flag="+flag);
                while(flag) {
                    System.out.println("生产商品");
                    flag = false;
                    obj.notify();
                    System.out.println("生产结束");
                    try {

                        obj.wait();//等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }





            }
        }
    }
}

