package com.neuedu.function;

import java.util.Scanner;

public class Test_ArrayFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入个数");
        int n=scanner.nextInt();

        int[] array=new int[n];

        ArrayFunction arrayFunction=new ArrayFunction();
        arrayFunction.input(array,n);
        arrayFunction.output(array);
    }
}
