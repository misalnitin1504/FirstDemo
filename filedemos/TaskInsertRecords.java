package com.prominentpixel.filedemos;

import java.io.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TaskInsertRecords {
    public static void insertRecordOddEven(String fileName) {


        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = null;
            FileWriter fwEven = new FileWriter("D:\\Even.txt");
            FileWriter fwOdd = new FileWriter("D:\\Odd.txt");
            while ((line = bufferedReader.readLine()) != null) {
                 System.out.println(line);
                String splitRecord[] = line.split(" ");
                int id = Integer.parseInt(splitRecord[0]);

                if (id % 2 == 0) {
                    fwEven.write(line + "\n");
                } else if (id % 2 != 0) {

                    fwOdd.write(line + "\n");

                }

            }
            fwOdd.close();
            fwEven.close();
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }

    public static void insertRecordInitialFile(String fileName) {

        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = null;


            while ((line = bufferedReader.readLine()) != null) {
                int count = 1;
                System.out.println(line);
                String splitRecord[] = line.split(" ");
                String name = splitRecord[1];
                char[] ch = name.toCharArray();
                char fileInitial = ch[0];
                String folderInitial=new String(String.valueOf(fileInitial));
                File path=new File("D:\\" +folderInitial);
                path.mkdir();
                FileWriter fwInitial = new FileWriter(path+"/"+fileInitial + ".txt");
                //fwInitial.write(String.valueOf(splitRecord));
                fwInitial.write(line);
                fwInitial.close();
            }
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void insertRecordTwoDigitWithCount(String fileName) {

        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = null;
                FileWriter fwMobile = new FileWriter("D:\\mobile.txt");
            Map<Integer, Integer> hashMap = new HashMap<>();
            int count = 1;

            while ((line = bufferedReader.readLine()) != null) {
                String splitRecord[] = line.split(" ");

                String mobile = splitRecord[2];
                String fd2 = mobile.substring(0, 2);
                int f2d = Integer.parseInt(fd2);
                if (hashMap.containsKey(f2d)) {
                    count++;
                }
                //else {count=1;}
                hashMap.put(f2d, count);

                String data = f2d + "->" + count + "\n";
                fwMobile.write(data);
            }
            System.out.println(hashMap);
            fwMobile.close();
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void insertRecordToDatabase(String fileName)   {

       // BufferedReader bufferedReader=new BufferedReader(fileReader);
        try {
            String line = null;
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                int count = 1;
                System.out.println(line);
                String splitRecord[] = line.split(" ");
                int id = Integer.parseInt(splitRecord[0]);
                String name = splitRecord[1];
                String mobile = splitRecord[2];

                try {

                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
                    PreparedStatement ps = con.prepareStatement("insert into tasktable  values (?,?,?)");


                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, mobile);
                    int insert = ps.executeUpdate();
                    System.out.println("Record inserted Successfully......");
                    ps.close();
                    con.close();
                } catch (SQLException | ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public static void main(String[] args)   {

        String filename="D:\\task.txt";

        //insertRecordOddEven(filename);
       // insertRecordInitialFile(filename);
        insertRecordTwoDigitWithCount(filename);
        //insertRecordToDatabase(filename);


    }
}
