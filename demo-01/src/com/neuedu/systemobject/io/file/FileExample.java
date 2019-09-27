package com.neuedu.systemobject.io.file;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        //文件，目录
        File  file=new File("D:\\Java");//"D:/Java"
        if(file.isDirectory()){//判断是否是目录
         File[] files=   file.listFiles();//提取目录中的文件
            for(File s:files){
                //文件名，文件绝对路径
                System.out.println(s.getName()+"   "+s.getAbsolutePath());

            }
        }

    }
}
