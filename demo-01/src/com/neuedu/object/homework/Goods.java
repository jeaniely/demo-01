package com.neuedu.object.homework;

import java.math.BigDecimal;

public class Goods {
    private String goodsname;
    private BigDecimal price;
    private int repertory;
    private String goodsid;

    //alt+insert
    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", repertory=" + repertory +
                ", goodsid='" + goodsid + '\'' +
                '}';
    }
}
