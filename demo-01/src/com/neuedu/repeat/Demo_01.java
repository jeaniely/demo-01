package com.neuedu.repeat;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num;
        System.out.println("输入一个数：");
        num=scanner.nextInt();

        boolean flag=true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
