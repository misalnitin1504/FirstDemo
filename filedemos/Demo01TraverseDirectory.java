package com.prominentpixel.filedemos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo01TraverseDirectory {

    public static void displayFiles(File[] files) throws IOException {
        // Traversing through the files array
        for (File filename : files) {
            // If a subdirectory is found,
            // print the name of the subdirectory
            if (filename.isDirectory()) {
                System.out.println("Directory: " + filename.getName()+ " ");

                // and call the displayFiles function
                // recursively to list files present
                // in subdirectory
                displayFiles(filename.listFiles());
            }

            // Printing the file name present in given path
            else {
                // Getting the file name
                System.out.println("File: " + filename.getName()+ " ");
                // make a connection to the file

                Path file = Paths.get(filename.getPath());

                // read all lines of the file
                long count = Files.lines(file).count();
                System.out.println("Total Lines: " + count);

            }
        }
    }

    public static void main(String[] args) throws IOException {
        // Storing the name of files and directories
        // in an array of File type
        File[] files = new File("E:\\MyDirectory").listFiles();
         // display files
        displayFiles(files);

}




























/*
        File file = new File("E:\\MyDirectory");
        System.out.println(file.isDirectory());
        String list[]= file.list();
        File listFiles[]=file.listFiles();
        for (File x:listFiles){
            //System.out.println(x);
            System.out.print(x.getName()+ " ");
            System.out.println(x.getParent());
        }*/
        /*
        for (String x:list){
            System.out.println(x);
        }*/
}

        /*
        // Root directory
        String rootDir = "E:\\MyDirectory";
/*
        try {
            // using `Files.walk()` method
            Files.walk(Paths.get(rootDir))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
/*
 try {

      // make a connection to the file
      Path file = Paths.get("input.txt");

      // read all lines of the file
      long count = Files.lines(file).count();
      System.out.println("\nTotal Lines: " + count);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }*/