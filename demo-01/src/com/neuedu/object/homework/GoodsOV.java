package com.neuedu.object.homework;

import java.math.BigDecimal;

public class GoodsOV {
    /**
     * 类：输出的结果
     */
    private String goodsname;
    private String goodsid;
    private BigDecimal price;
    private int num;
    private BigDecimal sumprice;

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BigDecimal getSumprice() {
        return sumprice;
    }

    public void setSumprice(BigDecimal sumprice) {
        this.sumprice = sumprice;
    }

    @Override
    public String toString() {
        return "GoodsOV{" +
                "goodsname='" + goodsname + '\'' +
                ", goodsid='" + goodsid + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", sumprice=" + sumprice +
                '}';
    }
}
