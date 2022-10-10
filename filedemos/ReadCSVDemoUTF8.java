package com.prominentpixel.filedemos;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadCSVDemoUTF8 {
    public static void main(String[] args) throws IOException{
/*
             //Getting the Path object
            String filePath = "myCSV.csv";
            Path path = Paths.get(filePath);
            //Creating a BufferedReader object
            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            //Reading the UTF-8 data from the file
            StringBuffer buffer = new StringBuffer();
            int ch = 0;
            while((ch = reader.read())!=-1) {
               buffer.append((char)ch+reader.readLine());
                //buffer.append(inputStream.readUTF());

                System.out.println("\n");
            }
            System.out.println("Contents of the file:\n"+buffer.toString());
        }
    }
*/

    StringBuffer buffer = new StringBuffer();
      try {
        //Instantiating the FileInputStream class
        FileInputStream fileIn = new FileInputStream("D:\\myCSV.csv");
        //Instantiating the DataInputStream class
        DataInputStream inputStream = new DataInputStream(fileIn);
        //Reading UTF data from the DataInputStream
        while(inputStream.available()>0) {
            buffer.append(inputStream.readUTF());
        }
    }
      catch(EOFException ex) {
        System.out.println(ex.toString());
    }
      catch(IOException ex) {
        System.out.println(ex.toString());
    }
      System.out.println("Contents of the file: \n"+buffer.toString());
}}
