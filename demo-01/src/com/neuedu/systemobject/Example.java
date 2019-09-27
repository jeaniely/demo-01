package com.neuedu.systemobject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Example {
    /**
     * 1：那些app
     *    java.lang  默认 常用的包装类、比较、显示等，Object
     *    java.util 工具包：集合、日期等
     *    java.io  输入和输出流
     *    java.math 数学公式
     *    java.sql jdbc的使用
     *    。。。。
     *2： java.lang
     *     Object   : equals与==
     *                == ：基本数据类型：两个数值比较是否相等
     *                     对象：与equals相同，比较是否同一个对象
     *                equals：只能比较对象，比较是否同一个对象
     *                        能够被重写
     *    基本数据类型  包装类
     *    byte  --  Byte
     *    short -- Short
     *    int   --Integer
     *    long  --Long
     *    char -- Character
     *    boolean-- Boolean
     *    float ---Float
     *    double --Double
     *
     *   String  字符串
     *
     *   作业题：
     *   1：int与Integer的区别
     *
     *   2：String，StringBuffer，StringBulider的区别
     *
     *   3：  读程序，输出结果
     *        Integer i1=12；
     *       Integer i2=12；
     *       System.out.println(i1==i2);
     *      Integer i3=129；
     *       Integer i4=129；
     *       System.out.println(i3==i4);
     *
     *
     *
     *  键值对
     *  Map ：key 和 value
     *      key---身份证
     *      value -- 个人信息
     *   Map----HashMap
     *          HashTable
     *
     *异常： 是在程序运行时，产生的不可预计的错误
     * Object---Throwable---Error
     *                         虚拟机产生的，如内存不足
     *                   ---异常
     *                         如：IO异常，SQL异常，Runtime异常
     *                         ---  检查型异常
     *                                必须要处理
     *                                IO异常，SQL异常
     *                         --- 非检查型异常
     *                                 可以处理，可以不处理
     *                               Runtime异常
     *
     *处理：1：抛出异常：使用throws  ，在方法声明中进行抛出，系统处理
     *     2：捕获异常：
     *        使用try{
     *            可能发生异常的语句
     *        } catch(可能发生的异常类 e){
     *            处理
     *        }finally{
               System.out.println("无论异常是否发生，都要进行处理");
             }
     *
     *throws 与throw区别
     *
     * String 、Stringbuffer、StringBuilder
     * 字符串的类
     * 其中String：不可变字符串： private final char value[];
     * 可变字符串：
     * StringBuffer：JDK1.0 ，线程安全，适合多线程
     * StringBuilder JDK1.5 ，适合单线程，性能较快
     *
     *Java课程安排：
     * 1：IO流
     *    File
     *    数据流：
     *    按照处理方式：
     *        字节流：Input  Output
     *        字符流  Reader Writer
     *     按照流的方向：-- 程序
     *         输入流：
     *         输出流：
     *    功能不能：
     *    节点流：从节点直接取出|存放数据
     *     处理流：String Int double 自定义对象
     *
     * 案例：图片从D：存放到 D:/img目录下
     *   1）提取 D:/timg.jpg
     *   2) 存放到d:/img/timg.jpg
     *
     * 序列化和反序列化
     *  序列化：将对象转会为字节存储
     *  反序列化：将字节转换为对象
     *
     * 2：多线程
     *
     * 3：JDBC
     *
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {

    }














}
