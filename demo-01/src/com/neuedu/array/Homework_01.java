package com.neuedu.array;

import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        //1:输入字符串
        Scanner  scanner=new Scanner(System.in);
        System.out.println("输入字符串");
        String str=scanner.next();


        //接受满足条件的字符
        char[] chars=new char[str.length()];
        int j=0;
        //2：判断满足条件的字符

        for(int i=0;i<str.length();i++){
            if(i%2!=0 && str.charAt(i)%2!=0){
                    chars[j++]=str.charAt(i);
                }

        }

        //3:结果的输出
        System.out.println("输出结果：");
        for(int i=0;i<j;i++){
            System.out.print(chars[i]);
        }
    }
}
