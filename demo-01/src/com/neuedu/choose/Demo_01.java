package com.neuedu.choose;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        //要从控制台进行输入的数据，使用Scanner对象
        Scanner scanner=new Scanner(System.in);

        //1:输入数据
        System.out.println("输入一个年份：");
        int n=scanner.nextInt();
        //2:判断 ，输出结果
        if(n%4==0&&n%100!=0 ||n%400==0){
            System.out.println(n+"年是闰年");
        }else{
            System.out.println(n+"年不是闰年");
        }



    }
}
