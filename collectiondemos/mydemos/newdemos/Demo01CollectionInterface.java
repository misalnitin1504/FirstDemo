package com.prominentpixel.collectiondemos.mydemos.newdemos;

import java.util.*;

public class Demo01CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);

        System.out.println(c1);
        Collection<Integer> c2= new ArrayList<Integer>(List.of(3,4,5));
        c1.addAll(c2);
        System.out.println(c1); //contains duplicate elements
        Object[] ob=c1.toArray();
        for (Object i:ob) {
            System.out.println(i);
        }
        System.out.println(ob);
        System.out.println(c1.toString());
        c1.remove(1);
        System.out.println(c1);
        c1.removeAll(c2);
        System.out.println(c1);
        c2.retainAll(c1);
        System.out.println(c2);
        System.out.println(c1.contains(2));
        System.out.println(c1.containsAll(c2));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.size());
        c1.clear();
        System.out.println(c1.isEmpty());
        System.out.println(c1);





    }
}