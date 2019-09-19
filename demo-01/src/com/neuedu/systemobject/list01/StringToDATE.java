package com.neuedu.systemobject.list01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDATE {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
       Date date= dateFormat.parse("1992-08-19");
        System.out.println(date);
    }

    public static  Date getDateFromString(String dateString){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date= null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
