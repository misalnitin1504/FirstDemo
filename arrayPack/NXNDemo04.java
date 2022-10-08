package com.prominentpixel.arrayPack;

import java.util.Scanner;

public class NXNDemo04 {
    public static void printNxNMatrix(int maxlen){
        int a[][]=new int[maxlen][maxlen];
        int count=1;
        for(int i=0;i<maxlen;i++){
            for(int j=0;j<maxlen;j++){
                a[j][i]=count ;
                count++;
            }

        }

        for(int i=0;i<maxlen;i++){
            for(int j=0;j<maxlen;j++){
                 System.out.print(a[i][j] +"\t");
            }
             System.out.println();
        }
        /*System.out.println("Print First row: ");
        //for(int i=0;i<1;i++)
        {
            for(int j=0;j<maxlen;j++){
                System.out.print(a[0][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("Print Second Column: ");
        for(int i=0;i<maxlen;i++){
            //for(int j=1;j<=1;j++)
            {
                System.out.print(a[i][1] +"\t");
            }
            System.out.println();
        }*/
        System.out.println("Print top-right to bottom-left: ");
        for(int i=0,j=maxlen-1;i<maxlen;i++,j--)
                     System.out.print(a[i][j] + "\t");

        System.out.println("\nPrint Bottom-right to top-left: ");
        for(int i= maxlen-1 ;i>=0;i-- )
            System.out.print(a[i][i] + "\t");




    }

    /*
    public static void printNxNMatrixFirstRow(int maxlen){
        int a[][]=new int[maxlen][maxlen];
        int count=1;
        for(int i=0;i<maxlen;i++){
            for(int j=0;j<maxlen;j++){

                a[i][j]=count ;
                // a[i][j]=a[j][i];
                count++;
                //System.out.print(a[i][j] +"\t");

            }
            // System.out.println();
        }
        for(int i=0;i<maxlen;i++){
            for(int j=1;j<=1;j++){
                    System.out.print(a[j][i] + "\t");

            }
            System.out.println();
        }*/



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Matrix Length:");
        int maxlen=sc.nextInt();
        System.out.println("Print NxN Matrix for N length:");
        printNxNMatrix(maxlen);

        //printNxNMatrixFirstRow(maxlen);


    }
}
