package com.neuedu.systemobject.sql.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModifyUtil {
    public static int modify(String sql,Object ...objects){
        Connection connection=null;
        PreparedStatement pstm=null;
        int i=-1;

        try {
            connection= SqlUtil.getConn();

            pstm=connection.prepareStatement(sql);

            SqlUtil.insertPreparedStatement(pstm,objects);
            i= pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(pstm,connection);
        }
      return i;
    }
}
