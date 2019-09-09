package com.neuedu.function;

public class Example {
    /**
     * 方法（函数）：代码的模块化
     * 1:方法定义
     *    修饰符  返回类型 方法名(参数){
     *        方法体
     *    }
     *   案例： public int add(int a,int b){
     *        return a+b;
     *    }
     *   修饰符：限定修饰符：public private 默认 protected
     *            类名：public 默认
     *            方法|属性：public private 默认 protected
     *           static
     *           final
     *   返回类型： 基本数据类型，引用数据类型，     void
     *                         return
     *   参数：形参 ： 数据类型 形参名
     *
     * 重载：在一个类中，方法名相同，参数类型不同（参数的个数，参数类型，参数顺序）
     *        和返回值无关
     *
     *
     * 2：方法的调用
     *  条件：1）谁调用：对象
     *        2） 调用什么：方法
     *        3） 怎么调用： 是否需要传参--实参，是否有返回值
     *
     * **/
    /**
     * 1:定义两个方法：
     *    1）用于数组的输入，--从控制台
     *       void input(int[] array,int num){
     *           Scanner scan=new Scanner(System.in);
     *           for(int i=0;i<num;i++){
     *                System.out.print("输入第"+(i+1)+"数值);
     *               int x=scan.nextInt();
     *               array[i]=x;
     *           }
     *       }
     *    2） 数组的输出
     *      void output(int[] array){
     *          Sytem.out.print("输出数值");
     *          for(int i=0;i<array.length;i++){
     *              System.out.print(" "+array[i]);
     *          }
     *      }
     *
     *    2:  输入一个字符串和一个字符，判断此字符是否在字符串中，如果在返回true，返回false
     *
     * **/

}
