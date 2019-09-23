package com.neuedu.systemobject.string01;

public class StringExample {
    public static void main(String[] args) {
        //1:拆分

       //splite();

        //2：求一个子串是否在字符串中，返回所在的下标
             // indexofString();
        //3：比较
        equalsString();

        //4:字符串转换类型--整型、double型

    }


    public static void splite(){
        String str="123-456-789";
        String[] strings=str.split("-");
        for(String s:strings) {
            System.out.println(s);
        }

    }

    public static void indexofString(){
        String substr="123";
        String str="456123789123456";
        //从开始的第一次出现的位置
        int i=str.indexOf(substr);
        System.out.println(i);
        String substrfromstr=str.substring(i,i+substr.length());//[i,i+substr.length())
        System.out.println(substrfromstr);
        //从最后开始
        int lasti=str.lastIndexOf(substr);
        System.out.println(lasti);
    }

    public static void equalsString(){
        String str1="123";
        String str2=str1;
        String str3="123";
        String str4="12"+"3";
        String str5=new String("123");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);
    }

}
