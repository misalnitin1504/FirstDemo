package com.prominentpixel.threading;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class CheckDirectoryORFile {
    //boolean flag=true;
    synchronized public void checkDirectory(File[] files) {
        for (File filename : files) {
            // If a subdirectory is found,
            // print the name of the subdirectory
            if (!filename.isDirectory()) {
                //flag=true;
                try {
                    wait();
                } catch (Exception e) {
                }

            }
                //flag=false;
                System.out.println("Directory: " + filename.getName() + " ");
                notify();
                checkDirectory((filename.listFiles()));


        }
    }

    synchronized public void countLines(File[] files) throws IOException {
        for (File filename : files) {
            // If a subdirectory is found,
            // print the name of the subdirectory
            if (filename.isDirectory()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            } else {
                // Getting the file name
                System.out.println("File: " + filename.getName() + " ");
                // make a connection to the file

                Path file = Paths.get(filename.getPath());

                // read all lines of the file
                long count = Files.lines(file).count();
                System.out.println("Total Lines: " + count);
                countLines((filename.listFiles()));
                notify();
            }
        }

    }
}

class PrintDirectory extends Thread{
    CheckDirectoryORFile check;
    PrintDirectory(CheckDirectoryORFile check){
        this.check=check;

    }

    @Override
    public void run() {
         check.checkDirectory( new File("E:\\MyDirectory").listFiles());
    }
}
class PrintFilesCountLines extends Thread{
    CheckDirectoryORFile check;
    PrintFilesCountLines(CheckDirectoryORFile check){
        this.check=check;
    }
    @Override
    public void run() {
        try {
            check.countLines( new File("E:\\MyDirectory").listFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
public class Demo03TraverseDirectory {
    public static void main(String[] args) {
        CheckDirectoryORFile check=new CheckDirectoryORFile();
        PrintDirectory pd=new PrintDirectory(check);
        PrintFilesCountLines pfcl=new PrintFilesCountLines(check);
        pd.start();
        pfcl.start();


    }
}
