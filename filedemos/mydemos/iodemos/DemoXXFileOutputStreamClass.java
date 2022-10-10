package com.prominentpixel.filedemos.mydemos.iodemos;

import java.io.FileOutputStream;

public class DemoXXFileOutputStreamClass {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testOut.txt");
            //FileOutputStream fout2=new FileOutputStream("D:\\test2.txt");
            fout.write(65); //writes A
            String s="Welcome to ProminentPixel ";
            byte b[]=s.getBytes();//converting string into byte array

            fout.write(b);//write b[] byte by byte
             for (byte x:b){
                 fout.write(x);
             }
             fout.write(b,5,s.length()-5);  //write byte from offset to length
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
