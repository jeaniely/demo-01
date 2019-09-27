package com.neuedu.systemobject.io.fileinputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***
 * 从文件中读取数据
 */
public class FileInputExample {
    public static void main(String[] args) {
        File file=new File("file01.txt");
        if(!file.exists()){
            return;
        }

        //输入流
        FileInputStream fis=null;

        try {
            fis=new FileInputStream(file);
            int k=fis.read();
            System.out.println(k);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
