package com.prominentpixel.collectiondemos.mydemos;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
       // hs.add();
        System.out.println(hs);
    }
}
