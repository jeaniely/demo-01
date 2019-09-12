package com.neuedu.object.interface01;

public interface Animal {
    /**
     *
     * 1.7以前的版本中
     * 接口中只含有两类：1）常量  默认存在 ：public static final
     *                   2）抽象方法:默认存在：public abstract
     * 1.8之后   :
     *       static void jump(){}
     *       default  void jump(){     }
     * **/
    // String NAME="zhangsan";
      void eat();

}
