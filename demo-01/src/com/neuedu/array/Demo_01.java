package com.neuedu.array;

import java.util.Random;

public class Demo_01 {
    /**
     * 案例：随机存放10个数到数组中，并进行输出
     *   生产随机数：
     *  1: Math.random()
     *  2: Random
     *  for与foreach区别
     *
     *
     * **/

    public static void main(String[] args) {
       int[] array=new int[10];
       Random random=new Random();
       //数组长度，对象的属性
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(101);
        }

        //只能进行输出
        for ( int a:array) {//a=array[0---array.length-1]
            System.out.print(a+" ");
        }
        System.out.println("\n----------------------");
        for ( int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

}
