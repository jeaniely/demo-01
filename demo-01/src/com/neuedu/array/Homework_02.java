package com.neuedu.array;

import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        //1:输入字符串
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入字符串1");
        String str1=scanner.next();
        System.out.println("输入字符串2");
        String str2=scanner.next();

       //2：合并
        char[] chars=new char[str1.length()+str2.length()];
        int j=0;
        for(int i=0;i<str1.length();i++){
            chars[j++]=str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            chars[j++]=str2.charAt(i);
        }

       //3：结果的输出
        System.out.println("输出结果：");
        for(int i=0;i<j;i++){
            System.out.print(chars[i]);
        }
    }
}
