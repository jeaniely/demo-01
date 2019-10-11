package com.neuedu.systemobject.sql.dao.dao;

import com.neuedu.systemobject.sql.dao.javabean.Student;

import java.util.List;

public interface StudentDAO {
    /**
     * 查找所有数据
     * @return
     */
    List<Student> getAll();

    /***
     * 根据sid进行删除
     * @param sid
     * @return
     */
   boolean delete(int sid);


}
