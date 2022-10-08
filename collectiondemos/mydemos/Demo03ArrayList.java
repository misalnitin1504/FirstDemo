package com.prominentpixel.collectiondemos.mydemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>(List.of(10,20,30,40,50,50));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Nitin","Yati","Kuldeep"));
        list.add(0,0);
        list.add(1,1);
        list.addAll(list1);
        list2.forEach( System.out::println);
        list.forEach( System.out::println);
        list.forEach( i->System.out.println(i));
        System.out.println("After calling show");
        list.forEach(n->show(n));



    }
    public static void show(int n){
        if(n>20){
            System.out.println(n);
        }
    }
}
