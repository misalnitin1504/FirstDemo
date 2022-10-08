package com.prominentpixel.arrayPack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class myDemoTS {
    public static void main(String args[]){
        Random rd=new Random();
        int x[]=new int[10];
        for(int i=0;i<x.length;i++) {
            x[i] = rd.nextInt(50);
            System.out.print(x[i]+" ");
        }
        Arrays.sort(x);
        System.out.println();
        System.out.println(Arrays.toString(x));
        int ts=x[2];
        System.out.println("ts="+ts);


     }
}
