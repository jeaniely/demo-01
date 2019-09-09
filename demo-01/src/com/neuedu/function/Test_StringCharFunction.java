package com.neuedu.function;

import java.util.Scanner;

public class Test_StringCharFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("一个字符串");
        String string=scanner.next();

        System.out.println("一个字符");
        char ch=scanner.next().charAt(0);

        StringCharFunction function=new StringCharFunction();
       boolean flag= function.charAndString(string,ch);

        System.out.println(flag);
    }
}
