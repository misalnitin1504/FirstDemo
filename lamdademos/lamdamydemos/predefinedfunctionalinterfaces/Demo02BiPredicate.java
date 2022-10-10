package com.prominentpixel.lamdademos.lamdamydemos.predefinedfunctionalinterfaces;

import java.util.function.BiPredicate;

public class Demo02BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
        System.out.println(bi.test(2, 1));
    }
}
