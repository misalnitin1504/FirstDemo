package com.prominentpixel.filedemos.mydemos.writerreaderdemoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoXXBufferedWriterClass {
    public static void main(String[] args) {
        try{
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to ProminentPixel");
        buffer.write("Welcome to Surat.");
        buffer.close();
        System.out.println("Success");
    }catch (Exception e){e.printStackTrace();}
}
}
