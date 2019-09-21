package com.neuedu.systemobject.exception;

public class Exception04 {
    public static void main(String[] args) {
        String str=null;
        try {
            new ExceptionString().checkString(str);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class ExceptionString{
    public void checkString(String str) throws MyException{
        if(str==null){
            throw new MyException("字符串为空");
        }
    }
}


class MyException extends Exception{
   String msg;
   public MyException(String msg){
       super(msg);
    //   this.msg=msg;
   }

   /* @Override
    public String getMessage() {
        return this.msg;
    }*/
}