package com.neuedu.function;

import java.util.Random;

public class Homework_02 {
    //求数组的平均值
    /**
     * 1:存在数组
     *    输出这些值
     * 2：求和
     *   int arraySum（int[] array）
     *
     *   3:均值
     *
     *
     * ***/
    void input(int[] array){
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }
    }

    void output(int[] array){
        System.out.println("数组：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    int arraySum(int[] array){
        int sum=0;
        for(int a:array){
            sum+=a;
        }
        return sum;
    }
    int arrayAvg(int length,int sum) {
        return sum / length;
    }

        public static void main(String[] args) {
         Homework_02 homework_02=new Homework_02();
         int[] array=new int[10];
         homework_02.input(array);
         homework_02.output(array);
         int sum=homework_02.arraySum(array);
         int avg=homework_02.arrayAvg(array.length,sum);
            System.out.println("\n 平均值为"+avg);
    }
}
