package com.prominentpixel.collectiondemos.mydemos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();

        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(1,"Z");// A is replaced by Z for key 1
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");

        lhm.put(5,"E");
        lhm.put(5,"Z");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        //does not maintains insertion order & contains unique keys but not values
        System.out.println(hm);  //{1=Z, 2=B, 3=C, 4=D, 5=E, 6=A}
        String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        //maintains insertion order & contains unique keys but not values
        System.out.println(lhm);//{5=Z, 1=A, 4=K, 2=B, 3=C, 6=A}


    }
}


