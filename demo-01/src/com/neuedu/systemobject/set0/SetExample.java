package com.neuedu.systemobject.set0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();
        stringSet.add("tom");
        stringSet.add("lili");
        stringSet.add("an");
        stringSet.add("zhang");
        stringSet.add("an");
        System.out.println(stringSet);
        System.out.println("=========================");
        for (String s:stringSet
             ) {
            System.out.println(s);
        }
        System.out.println("====================");
        Iterator<String> iterator=stringSet.iterator();
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}
