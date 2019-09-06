package com.neuedu.array;

import java.util.Scanner;

public class Demo_02 {
    /**
     *  案例：回文 12321 1221
     *       判断字符串是否是回文
     *        只判断字母和数字
     *        char
     *
     * **/
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("输入字符串：");
        //通过scanner对象输入的是字符串String，要转化为char ：String--char[]
        char[] chars=scanner.next().toCharArray();//char

        boolean flag=true;//是否是回文，默认是

        //两个指针，一个从开始--i，一个从结尾--j：i<j
        for(int i=0,j=chars.length-1;i<j;){
            //首先判断i，j的位置的值是否是字母|数字，
            if(chars[i]>='a'&& chars[i]<='z'||chars[i]>='A'&&chars[i]<='Z'||chars[i]>='0'&&chars[i]<='9'){
                if(chars[j]>='a'&& chars[j]<='z'||chars[j]>='A'&&chars[j]<='Z'||chars[j]>='0'&&chars[j]<='9'){
                       if(chars[i]!=chars[j]){
                           flag=false;
                           break;
                       }
                       i++;j--;
                }else{
                     j--;
                }
            }else{
                i++;
            }
        }

        if(flag){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }


    }
}
