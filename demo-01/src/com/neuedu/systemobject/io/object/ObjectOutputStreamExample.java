package com.neuedu.systemobject.io.object;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        File file=new File("file02.tx");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=null;
        ObjectOutputStream oos=null;

        fos=new FileOutputStream(file);
        oos=new ObjectOutputStream(fos);

        Student student=new Student();
        student.setId(112);
        student.setName("tom");

        oos.writeObject(student);
        oos.flush();

        oos.close();
        fos.close();

    }
}
