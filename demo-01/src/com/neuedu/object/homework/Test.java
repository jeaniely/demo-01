package com.neuedu.object.homework;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //ctrl+shift+/   多行注释
        /*List<Goods> goodslist=new ArrayList<>();
        GoodsController.list(goodslist);
        System.out.println(goodslist);//goodslist.toString();*/
        List<Goods> goodslist=new ArrayList<>();
        GoodsController.list(goodslist);
        System.out.println(goodslist);

        //第一个商品
        Goods goods=GoodsController.getGoodsByName(goodslist,"铅笔");
        System.out.println(goods);

        List<GoodsOV> goodsOVList=new ArrayList<>();

        GoodsController.sumByOneGoods(goodsOVList,goods,10);

        //
        //第2个商品
        Goods goods2=GoodsController.getGoodsByName(goodslist,"毛笔");
        System.out.println(goods2);

        GoodsController.sumByOneGoods(goodsOVList,goods2,2);

        System.out.println(goodsOVList);

        System.out.println("商品项："+GoodsController.numByGoodsOV(goodsOVList));
        System.out.println("商品数量："+GoodsController.sumGoodsBynum(goodsOVList));
        System.out.println("总结："+GoodsController.sumGoodsBysumPrice(goodsOVList));
    }
}
