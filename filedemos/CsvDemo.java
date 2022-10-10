package com.prominentpixel.filedemos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class CsvDemo {

        public static void main(String[] args) {

            // Using try-with-resources to close file
            try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\myCSV.csv")) {
                 DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
                //Writing UTF data to the output stream
                outputStream.writeUTF("\n01, Nitin Misal, 137-A, Avirbhav Society No:2, 15/04/1990, 5/09/2022, 32");
                outputStream.writeUTF("\n02, Sachin Misal, 137-A, Avirbhav Society No:2, 02/02/1992, 5/09/2022, 30");

                outputStream.flush();
                System.out.println("Data written to file successfully!");
            } catch (Exception exception) {
                System.out.println(exception);

            }
        }
    }

