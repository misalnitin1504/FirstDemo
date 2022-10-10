package com.prominentpixel.filedemos.mydemos.writerreaderdemoes;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoXXBufferedReaderClass {
    public static void main(String[] args) {
        // Creates an array of character
        char[] array = new char[20];

        try {
            // Creates a FileReader
            FileReader file = new FileReader("D:\\testout.txt");

            // Creates a BufferedReader
            BufferedReader input = new BufferedReader(file);
            // Skips the 5 characters
            input.skip(5);
            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
