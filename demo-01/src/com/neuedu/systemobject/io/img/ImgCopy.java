package com.neuedu.systemobject.io.img;


import java.io.*;

public class ImgCopy {
    public static void main(String[] args) throws IOException {
        //1:提取
        File file=new File("D:/timg.jpg");
        if(!file.exists()){
            return;
        }
      //2：存放
        File outfile=new File("d:/img/timg.jpg");
        if(!outfile.exists()){
            outfile.createNewFile();
        }
        //读
        FileInputStream fis=null;//节点流
        BufferedInputStream bis=null;//缓存流

        //写
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;

        fis=new FileInputStream(file);
        bis=new BufferedInputStream(fis);


        fos=new FileOutputStream(outfile);
        bos=new BufferedOutputStream(fos);

        byte[] bytes=new byte[1024];


        int length=0;
        while ((length=bis.read(bytes))!=-1) {
          bos.write(bytes,0,length);
           bos.flush();
        }


        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
