package com.neuedu.systemobject.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("tom","tom 23");
        map.put("lili","lili 24");
        map.put("an","an 19");
        map.put("tom","tom 20");

        System.out.println(map);
        System.out.println("==========================");
        //key

        Set<String> setkey=map.keySet();
        //根据key得到value
       for(String s:setkey){

           System.out.println(s+"  "+map.get(s));
       }

        System.out.println("===================================");
      Set<Map.Entry<String,String>> entry=map.entrySet();
      for(Map.Entry<String,String> e:entry){
          System.out.println(e.getKey()+"  "+e.getValue());
      }
    }
}
