package com.neuedu.object.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Goods> goodsList=new ArrayList<>();
        List<GoodsOV> goodsOVList= new ArrayList<>();
        GoodsController.list(goodsList);
        while (true) {
            System.out.println("输入命令（1：输入，2：打印）");
            int n=scanner.nextInt();
            if(n==1||n==2){
                Factory.menu(n,goodsOVList,goodsList);
                if(n==2){
                    break;
                }
            }


        }
    }
}
