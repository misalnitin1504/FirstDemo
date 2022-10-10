package com.prominentpixel.filedemos.mydemos.predefinedstreamdemos;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo01PredefinedStreams {
    public static void main(String[] args) {

        System.out.println("Hello Out");
        System.err.println("Hello Err");//o/p shows in read color in IntelliJIDEA IDE

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);



    }
}
