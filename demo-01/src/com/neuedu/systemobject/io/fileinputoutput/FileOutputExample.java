package com.neuedu.systemobject.io.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 向文件中存放数据
 */
public class FileOutputExample {
    public static void main(String[] args) {
        //创建文件
        File file=new File("file01.txt");
        if(!file.exists()) {//判断文件是否存在，如果不存在，创建
            try {
                file.createNewFile();//文件创建的过程；产生异常的处理
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //存放数据
        FileOutputStream ops=null;

        try {
            ops=new FileOutputStream(file);//与文件进行连接生产输出流
            ops.write(12);
            ops.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(ops!=null){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
