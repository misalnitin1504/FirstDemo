package com.prominentpixel.collectiondemos.mydemos;

import java.util.ArrayDeque;

public class DequeDemo01 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach(x-> System.out.println(x));
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        System.out.println("After offerFirst()");
        dq.forEach(x-> System.out.println(x));
        dq.removeLast();
        dq.forEach(x-> System.out.println(x));

    }
}
