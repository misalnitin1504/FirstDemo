package com.prominentpixel.collectiondemos.mydemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo04LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList list1=new LinkedList<>(List.of(10,20,30,40,50,50));
        LinkedList<String> list2=new LinkedList<>(Arrays.asList("Nitin","Yati","Kuldeep"));
        list.add(0,0);
        list.add(1,1);
        list.addFirst(100);   // extra methods in Linked List addFirst() & addLast(), getFirst & getLast()
        list.addLast(200);
        list.addAll(list1);

        list2.forEach( System.out::println);
        list.forEach( System.out::println);
        list.forEach( i->System.out.println(i));
        System.out.println("Descending Iterator method");
        list2.descendingIterator();
        System.out.println(list2);
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
