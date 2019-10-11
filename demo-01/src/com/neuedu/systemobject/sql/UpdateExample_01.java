package com.neuedu.systemobject.sql;

import com.neuedu.systemobject.sql.util.ModifyUtil;

public class UpdateExample_01 {
    public static void main(String[] args) {
        String sql="update student set sname=? where sid=?";
        int i=ModifyUtil.modify(sql,"linux",11);
        System.out.println("影响的行数为："+i);
    }
}
