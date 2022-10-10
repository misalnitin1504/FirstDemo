package com.prominentpixel.stringdemos;

import java.util.Scanner;

public class ReverseDemo003 {
    public static void printReverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("Reverse String is : "+rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        printReverse(str);
    }
}
