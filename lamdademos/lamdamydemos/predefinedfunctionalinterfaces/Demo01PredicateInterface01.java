package com.prominentpixel.lamdademos.lamdamydemos.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class Demo01PredicateInterface01 {
    public static void main(String[] args) {
        /*
        Predicate<Integer> checkAge = age -> (age > 18); // Creating predicate
        System.out.println(checkAge.test(10));    // Calling Predicate method
        System.out.println(checkAge.negate());    // Calling Predicate method
*/
        Predicate<Integer> greaterThan=age->(age>18);
        Predicate<Integer> lessThan=age->(age<18);

        boolean resultAND=greaterThan.and(lessThan).test(10);
        System.out.println(resultAND);
        boolean resultOR=greaterThan.or(lessThan).test(10);
        System.out.println(resultOR);

        boolean gtNEGATE=greaterThan.negate().test(10);
        System.out.println(gtNEGATE);
        boolean ltNEGATE=lessThan.negate().test(10);
        System.out.println(ltNEGATE);






    }
}
