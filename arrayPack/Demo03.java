package com.prominentpixel.arrayPack;

import java.util.Scanner;

public class Demo03 {
    public static void findSecondLargetAndThirdSmallest(int a[]){
       int sl=0;
        int ts=0;
        int max=a[0];
        int min=a[0];
        for (int i=1;i<a.length;i++) {
            if (a[i] > max) {
                sl=max;
                max = a[i];
                //sl=max-1;

            }
            else if(a[i]>sl){
                sl=a[i];
            }
            if(a[i]<min){
                min=a[i];
                //ts=min+2;
            }
         /*   else if(a[i]<ts){
                ts=a[i];
            }*/
        }
        System.out.println("\nMax="+max);
       // sl=max-1;
        System.out.println("Second Max="+sl);
        System.out.println("Min="+min);
        System.out.println("ts="+ts);
    }
    public static void main(String args[]){
    int a[]=new int[50];
        int count=50;
        for(int i=0;i<a.length;i++){
            a[i]=count;
            count--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    findSecondLargetAndThirdSmallest(a);

    }
}
