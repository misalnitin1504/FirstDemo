package com.prominentpixel.collectiondemos.mydemos;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(10);
        System.out.println(ls);  //o/p: [10, 20, 30] maintains insertion order & contains unique values
    }
}
