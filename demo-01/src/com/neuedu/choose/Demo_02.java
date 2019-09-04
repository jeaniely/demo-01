package com.neuedu.choose;


import java.util.Scanner;

public class Demo_02 {
    public static void main(String[] args) {
        //要从控制台进行输入的数据，使用Scanner对象
        //alt+enter
        Scanner scanner=new Scanner(System.in);

        //1：输入数据
        System.out.println("输入成绩：");
        int score=scanner.nextInt();

        //2:判断等级并输出
        if(score>=0&& score<=100){

            if(score>=90){
                System.out.println("A");
            }else if(score>=80){
                System.out.println("B");
            }else if(score>=70){
                System.out.println("C");
            }else if(score>=60){
                System.out.println("D");
            }else{
                System.out.println("E");
            }

        }else{
            System.out.println("成绩输入有误！");
        }

    }
}
