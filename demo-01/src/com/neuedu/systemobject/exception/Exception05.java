package com.neuedu.systemobject.exception;

public class Exception05 {
    public static void main(String[] args) {
        String str=null;
        new ExceptionString01().checkStringnull(str);
    }

}
class ExceptionString01 {
    public void checkStringnull(String str){
        if(str==null){
            throw new MyException01("字符串为空");
        }
    }
}

class MyException01 extends RuntimeException{
    public MyException01(String msg){
        super(msg);
    }
}