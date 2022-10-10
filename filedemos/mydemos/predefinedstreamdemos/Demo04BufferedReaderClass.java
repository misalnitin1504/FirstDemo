package com.prominentpixel.filedemos.mydemos.predefinedstreamdemos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo04BufferedReaderClass {
    public static void main(String[] args) {
        try {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Id:");
        int id=Integer.parseInt(br.readLine());
        System.out.print("Enter Name:");
        String name=br.readLine();

        System.out.println(id+" "+name);
        }catch (Exception e){e.printStackTrace();}
    }
}
