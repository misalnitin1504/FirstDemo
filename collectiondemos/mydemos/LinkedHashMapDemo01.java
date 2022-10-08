package com.prominentpixel.collectiondemos.mydemos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(5,"E");
        lhm.put(5,"Z");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        //maintains insertion order & contains unique keys but not values
        System.out.println(lhm);//{5=Z, 1=A, 4=K, 2=B, 3=C, 6=A}
        LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();
        lm.put("GCE",2);
        lm.put("KCE",2);
        lm.put("GCE",3);
        System.out.println(lm);

    }
}
