package com.neuedu.systemobject.exception;

public class Exception01 {
    /**
     * 1：throws  ArrayIndexOutOfBoundsException
     * 2：
     * @param args
     */
    public static void main(String[] args)  {
        int array[]=new int[5];
        try {//可能发生异常的语句
            array[5] = 2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("无论异常是否发生，都要进行处理");
        }

        System.out.println("是否执行呢？是要执行的");
    }
}
