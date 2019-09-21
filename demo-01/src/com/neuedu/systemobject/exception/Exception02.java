package com.neuedu.systemobject.exception;

import java.io.File;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) {
        File file=new File("kk.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();//alt+enter
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
