package com.prominentpixel.collectiondemos.mydemos;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo01 {
    public static void main(String[] args) {
        SortedSet<Integer> ss=new TreeSet<>(List.of(30,20,10,10,70,40));
        System.out.println(ss);//[10, 20, 30, 40, 70]
        System.out.println("First Element:"+ss.first());//10
        System.out.println("Last Element:"+ss.last());//70
        //Returns less than Elements.
        System.out.println("The respective element is given as: " + ss.headSet(30));//[10, 20] //30 will not printed
        //Returns greater than key & start with key element.
        System.out.println("The respective element is given as: " + ss.tailSet(30));//[30, 40, 70]
        System.out.println("Subset: " + ss.subSet(20,70));//Subset: [20, 30, 40] 70 will be not printed


    }
}
