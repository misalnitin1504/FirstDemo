package com.prominentpixel.filedemos.mydemos.predefinedstreamdemos;

import java.io.Console;

public class Demo06ConsoleClass {
    public static void main(String[] args) {
        Console c= System.console();
        if(c!=null) System.out.println("Console is available");
        else {System.err.println("Error: Console is not available"); return;}

        System.out.println("Enter Name");
        String name= c.readLine();
        System.out.println("Enter Password:");
        char[] password=c.readPassword();
        System.out.println(name+" "+password);
    }
}
