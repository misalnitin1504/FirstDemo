package com.prominentpixel.filedemos;

import java.io.FileOutputStream;

public class CloseFileTryWithResources {
    public static void main(String[] args) {

        // Using try-with-resources to close file
        try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
            String msg = "Welcome to ProminentPixel";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfully!");
        } catch (Exception exception) {
            System.out.println(exception);

        }
    }
}