package com.prominentpixel.lamdademos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        int a[]={10,2,30,4,5};
        //List<Integer> numbers=new ArrayList<Integer>(List.of(2,5,8,3,4,1));
         //List<Integer> sortedArray=numbers.stream().sorted().collect(Collectors.toList());
        int[] sorted = IntStream.of(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println("Sorted Array: "+sorted );
        for (int a1 : sorted){
//            System.out.println(a1);
        }
        IntStream a1 = IntStream.of(a); //List<Integer>
        Stream<int[]> a2 = Stream.of(a); //List<[Integer]>


/*

        List<Integer> reverseSortedNumber = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse Array: "+reverseSortedNumber);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
*/
    }
}
