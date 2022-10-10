package com.prominentpixel.myCorePractice.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Demo06_NamesAlphabeticaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int i, j;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        String names[] = new String[5];
		
        System.out.print("Enter 5 Names : ");
        for(i=0; i<5; i++)
        {
            names[i] = scan.nextLine();
        } 
        Arrays.sort(names);
		/*
        System.out.println("\nSorting Words/Names in Alphabetical Order...\n");
        for(i=0; i<5; i++)
        {
            for(j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
		*/
        System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");
		
        System.out.println("\nNow the List is :\n");
        for(i=0;i<5;i++)
        {
            System.out.println(names[i]);
        }
    }
}

