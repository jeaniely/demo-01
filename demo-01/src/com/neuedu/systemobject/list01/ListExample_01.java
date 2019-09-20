package com.neuedu.systemobject.list01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample_01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Integer integer=34;
        list.add(integer);
        list.add(integer);
        list.add(integer);
        list.add(integer);
        list.add(integer);

        System.out.println(list);
        System.out.println("==========================");
        //数组的长度，字符串的长度，集合长度
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println("\n==========================");
        //数组的长度，字符串的长度，集合长度
        for(Integer i:list){
            System.out.print(i+"   ");
        }
        System.out.println("\n=========================");
        Iterator<Integer> integerIterator=list.iterator();
        for(;integerIterator.hasNext();){
            System.out.println(integerIterator.next());
        }
    }
}
