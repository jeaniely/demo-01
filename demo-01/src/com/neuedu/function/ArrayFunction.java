package com.neuedu.function;

import java.util.Scanner;

public class ArrayFunction {
    void input(int[] array, int num) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.print("输入第" + (i + 1) + "数值");
            int x = scan.nextInt();
            array[i] = x;
        }
    }

    void output(int[] array) {
        System.out.print("输出数值");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

}
