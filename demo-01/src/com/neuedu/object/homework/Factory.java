package com.neuedu.object.homework;

import java.util.List;
import java.util.Scanner;

public class Factory {
    public  static void menu(int n,List<GoodsOV> goodsOVList,List<Goods> goodsList){
        if(n==1){
            /**
             * 输入商品
             */
            setGoodsOV(goodsOVList,goodsList);
        }

        if(n==2){
            /**
             * 打印小票
             */
            print(goodsOVList);
        }
    }

    public static void setGoodsOV(List<GoodsOV> goodsOVList,List<Goods> goodsList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入商品名");
        String goodsname=scanner.next();
        System.out.println("输入数量");
        int num=scanner.nextInt();

        GoodsController.sumByOneGoods(goodsOVList,GoodsController.getGoodsByName(goodsList,goodsname),num);


    }

    public static void print(List<GoodsOV> goodsOVList){
        System.out.println(goodsOVList);

        System.out.println("商品项："+GoodsController.numByGoodsOV(goodsOVList));
        System.out.println("商品数量："+GoodsController.sumGoodsBynum(goodsOVList));
        System.out.println("总结："+GoodsController.sumGoodsBysumPrice(goodsOVList));
    }
}
