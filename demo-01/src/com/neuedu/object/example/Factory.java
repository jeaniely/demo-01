package com.neuedu.object.example;

public class Factory {
    //多态--返回的时候
    public static JDBC create(String name){
        if(name!=null){
            if("mysql".equals(name)){
                return new Mysql();
            }
            if("oracle".equals(name)){
                return new Oracle();
            }
        }
        return null;
    }
}
