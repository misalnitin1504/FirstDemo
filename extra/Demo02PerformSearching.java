package com.prominentpixel.extra;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02PerformSearching {
    public  static void linearSearch(int a[],int x){
        for (int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println(x+" is present at pos: "+i);
                break;
            }

        }
        //System.out.println( "Element is not present.");
    }
    public  static void binarySearch(int a[],int x){
        int first=0;
        int last=a.length-1;
        int mid=(first+last)/2;
        while( first <= last ){
            if ( a[mid] < x ){
                first = mid + 1;
            }else if ( a[mid] == x ){
                System.out.println(x+" is present at pos: "+mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void hashSearch(int a[],int x) {

    }
            public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter Elements of array:");
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements are:"+ Arrays.toString(a));
        System.out.println("Enter element you want to search:");
        int x=sc.nextInt();
        linearSearch(a,x);
        binarySearch(a,x);
        hashSearch(a,x);




            }
}
