package com.neuedu.object.homework;

import java.math.BigDecimal;
import java.util.List;

public class GoodsController {

    /**
     * 对Goods对象的操作，包括，存放数据，删除数据，修改数据，查找数据
     * **/
    /**
     *  生产商品信息
     * @param goodsList
     */
    public static void list(List<Goods> goodsList){
        Goods goods1=new Goods();
        goods1.setGoodsname("铅笔");
        goods1.setPrice(new BigDecimal(1));
        goods1.setRepertory(200);
        goods1.setGoodsid("0978451");


        Goods goods2=new Goods();
        goods2.setGoodsname("橡皮");
        goods2.setPrice(new BigDecimal(2));
        goods2.setRepertory(400);
        goods2.setGoodsid("0978520");

        Goods goods3=new Goods();
        goods3.setGoodsname("毛笔");
        goods3.setPrice(new BigDecimal(20));
        goods3.setRepertory(100);
        goods3.setGoodsid("0925851");

        Goods goods4=new Goods();
        goods4.setGoodsname("墨水");
        goods4.setPrice(new BigDecimal(5));
        goods4.setRepertory(150);
        goods4.setGoodsid("0977411");

        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
    }

    /**
     * 根据商品名进行商品的查找，
     * 返回值为商品
     * @param goodsList
     * @param goodsname
     * @return
     */
    public static Goods getGoodsByName(List<Goods> goodsList,String goodsname){
        for(Goods goods:goodsList){
            if(goods.getGoodsname().equals(goodsname)){
                return goods;
            }
        }
        return null;

    }

    /**
     * 计算一种商品的总价
     * @param goods
     * @param num
     * @return
     */
    public static void sumByOneGoods(List<GoodsOV> goodsOVList, Goods goods,int num){
        GoodsOV goodsOV=new GoodsOV();
        goodsOV.setGoodsname(goods.getGoodsname());
        goodsOV.setPrice(goods.getPrice());
        goodsOV.setGoodsid(goods.getGoodsid());
        goodsOV.setNum(num);
        goodsOV.setSumprice(goods.getPrice().multiply(new BigDecimal(num)));
        goodsOVList.add(goodsOV);
    }

    /**
     * 总结
     * @param goodsOVList
     * @return
     */
    public static BigDecimal sumGoodsBysumPrice(List<GoodsOV> goodsOVList){
        BigDecimal decimal=new BigDecimal(0);
        for(GoodsOV goodsOV:goodsOVList){
        decimal= decimal.add(goodsOV.getSumprice());
        }
        return decimal;
    }

    /***
     * 统计的总个数
     * @param goodsOVList
     * @return
     */
    public static int sumGoodsBynum(List<GoodsOV> goodsOVList){
       int sumnum=0;
        for(GoodsOV goodsOV:goodsOVList){
            sumnum+=goodsOV.getNum();
        }
        return sumnum;
    }

    /***
     * 商品的数量
     * @param goodsOVList
     * @return
     */
    public  static int numByGoodsOV(List<GoodsOV> goodsOVList){
        return goodsOVList.size();
    }


    }
