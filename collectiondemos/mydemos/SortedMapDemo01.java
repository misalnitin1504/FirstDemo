package com.prominentpixel.collectiondemos.mydemos;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo01 {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(102));//102 not be considered
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(102));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(100, 102));//102 not be considered
    }
}

