package com.neuedu.systemobject.object01;

public class Integer_String_int {
    public static void main(String[] args) {
        // int--->Integer
        int i1=34;
        Integer integer1=i1; //自动装箱

        Integer integer2=new Integer(i1);//通过new方法


        //Integet-->int

        Integer integer3=45;
        int i2=integer3;//自动拆箱

        int i3=integer3.intValue();

        //String--->Integer

        String strint="12345";
        Integer integer4=new Integer(strint);

        Integer integer5=Integer.getInteger(strint);

        //String<---Integer
        String strint1=integer5.toString();
        String strint2=String.valueOf(integer5);

        // int--->String

        String str1=i1+"";
        String str2=Integer.toString(i1);

        // int<---String
        int i4=Integer.parseInt(str1);







    }
}
