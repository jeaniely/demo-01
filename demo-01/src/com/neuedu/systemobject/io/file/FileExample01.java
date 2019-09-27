package com.neuedu.systemobject.io.file;

import java.io.File;
import java.io.IOException;

public class FileExample01 {
    public static void main(String[] args) {
        File file=new File("file01.txt");
       if(!file.exists()) {//判断文件是否存在，如果不存在，创建
           try {
               file.createNewFile();//文件创建的过程；产生异常的处理
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
}
