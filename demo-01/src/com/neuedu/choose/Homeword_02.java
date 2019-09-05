package com.neuedu.choose;


import java.util.Scanner;

public class Homeword_02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("输入一个重量：");
        double   weight=scanner.nextDouble();
        //向上取整
       int weightceil= (int)(Math.ceil(weight));
        System.out.println("1：省内 2：省外");
        int n1=scanner.nextInt();
        if(n1==1){
            if(weightceil<=1){
                System.out.println("需要费用："+10);
            }else{
                System.out.println("需要费用："+(10+(weightceil-1)*4));
            }
        }else if(n1==2){
            if(weightceil<=1){
                System.out.println("需要费用："+12);
            }else{
                System.out.println("需要费用："+(12+(weightceil-1)*8));
            }
        }else {
            System.out.println("输入有误！");
        }

    }
}
