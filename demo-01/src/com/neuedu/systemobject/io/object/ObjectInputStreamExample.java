package com.neuedu.systemobject.io.object;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("file02.tx");
        if(!file.exists()){
            return ;
        }

        FileInputStream fis=null;
        ObjectInputStream ois=null;

        fis=new FileInputStream(file);
        ois=new ObjectInputStream(fis);

        Student student=(Student)ois.readObject();
        System.out.println(student);


    }
}
