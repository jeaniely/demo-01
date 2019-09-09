package com.neuedu.function;

public class Example_02 {
    public static void main(String[] args) {
      int   a=4;
       int[] array={41,89,33};

        fun(a,array);

        System.out.println(a); //2  |  4

        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]); // 41 34 33
        }

    }

    public static void fun(int a,int[] array){
        a=2;
        array[1]=34;
    }

}
