package com.prominentpixel.filedemos.mydemos.predefinedstreamdemos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo05ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Id:");
        int id= sc.nextInt();
        System.out.print("Enter Name:");
        String name= sc.nextLine();
        /*
        System.out.print("Enter Name:");
        String name= sc.nextLine();
*/

        System.out.println(id+" "+name);

    }
}
