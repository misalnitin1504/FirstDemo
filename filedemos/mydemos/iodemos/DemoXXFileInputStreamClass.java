package com.prominentpixel.filedemos.mydemos.iodemos;

import java.io.FileInputStream;

public class DemoXXFileInputStreamClass {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("D:\\testout.txt");

            /* to read Single Char
                   int i=fin.read();
                    System.out.print((char)i);
             */
            //to read whole file single character at a time
            int i=0;
            String s=fis.toString();
            byte b[]=s.getBytes();
            while( (i=fis.read())!=-1) {
                System.out.print((char) i);
            }
            fis.close();
            /*
            byte b[]=new byte[fis.available()]; //creates b[] equal no of bytes available in file
            fis.read(b);
            String s=new String(b);
            System.out.println(s); */

        }catch(Exception e){System.out.println(e);}
    }
}
