package com.prominentpixel.collectiondemos.datastructureexercises;

import java.util.List;
import java.util.TreeSet;

public class Demo04TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,50,40,10,70));
        //ts.add(25);//[10, 20, 25, 40, 50, 70]
        System.out.println(ts);//o/p: [10, 20, 40, 50, 70]
        System.out.println(ts.ceiling(55));//70
        System.out.println(ts.floor(55));//50
        System.out.println(ts.first());//10
        System.out.println(ts.last());//70
        System.out.println(ts.headSet(20));//[10]
        System.out.println(ts.tailSet(20));//[20, 40, 50, 70]
        System.out.println("Subset: " + ts.subSet(20,70));//Subset: [20, 40, 50] 70 will be not printed
    }
}
