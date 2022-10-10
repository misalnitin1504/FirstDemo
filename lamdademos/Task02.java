package com.prominentpixel.lamdademos;

import java.util.*;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        Student s1=new Student(02,"XYZ");
        Student s2=new Student(01,"ABC");
        Student s3=new Student(03,"MNP");
        Set<Student> list=new HashSet<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //Collections.sort(list);
        List<Student> sortedStudents=list.stream().filter(s -> s.getId()>0).collect(Collectors.toList());
        System.out.println(sortedStudents);
/*
        List<Integer> reverseSortedNumber = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedNumber);*/
    }
}
