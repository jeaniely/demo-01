package com.neuedu.function;

import java.util.Random;

public class Homework_01 {
   //求数组的最大值，及其最大值的下标
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
    int getIndexOfMaxElement(int[] array){
        int max=array[0];//最大值
        int max_i=0;//最大值下标
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                max_i=i;
            }
        }

        return max_i;
    }


    public static void main(String[] args) {
        Homework_01 homework_01=new Homework_01();
        int[] array=new int[10];
        homework_01.input(array);
        homework_01.output(array);
        int max_index=homework_01.getIndexOfMaxElement(array);
        System.out.println("\n 最大值为"+array[max_index]+",下标为"+max_index);


    }
}
