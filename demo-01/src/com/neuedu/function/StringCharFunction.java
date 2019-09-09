package com.neuedu.function;

public class StringCharFunction {
    boolean charAndString(String str,char ch){
        boolean flag=false;//不存在
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                flag=true;
                break;
            }
        }

        return flag;
    }
}
