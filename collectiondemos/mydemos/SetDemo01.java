package com.prominentpixel.collectiondemos.mydemos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);//
        // hs.add();
        System.out.println(hs);//0/p: [20, 10, 30] so doesn't maintain insertion order

    }
}
