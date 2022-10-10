package com.prominentpixel.lamdademos.lamdamydemos;

import com.prominentpixel.lamdademos.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {

        List<Integer> c=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> d=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> b=new ArrayList<Integer>(integers);
        List<Integer> a = new ArrayList<>(b);

    }
}
