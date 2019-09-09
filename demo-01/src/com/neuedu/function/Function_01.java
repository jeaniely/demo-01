package com.neuedu.function;

/**
 * 1:两个数相加
 *  1）int  int
 *  2) double double
 *  3)int  double
 *    double int
 */
public class Function_01 {
    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public double add(double a,int b){
        return a+b;
    }

    public double add(int a,double b){
        return a+b;
    }
}
