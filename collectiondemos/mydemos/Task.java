package com.prominentpixel.collectiondemos.mydemos;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        Student s1=new Student(01,"Nitin","Pandesara");
        Student s2=new Student(02,"Yati","Olpad");
        Student s3=new Student(01,"Nitin","Pandesara");
        Student s4=new Student(03,"Sachin","Varacha");


        //Check how hashSet internally works: it creates object of hashmap internally with each constructer
        HashSet<Student> hs=new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        System.out.println(hs.hashCode());
        for(Student s:hs){
            System.out.println(s);
        }


    }
}
