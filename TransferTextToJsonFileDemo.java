package com.jsondemos;

import org.json.simple.JSONObject;

import java.io.*;
import java.util.*;



public class TransferTextToJsonFileDemo {
    public static void transferTextToJsonFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            FileWriter fileWriter = new FileWriter("D:\\testJson.json");
            String jsonData="";
            JSONObject obj=new JSONObject();
            Set<String> studList=new LinkedHashSet<>();

            while ((line = bufferedReader.readLine()) != null) {

                String splitRecord[] = line.split(" ");
                String id = splitRecord[0];
                String name=splitRecord[1];
                String mobile=splitRecord[2];
                obj.put("name",name);
                obj.put("id",id);
                obj.put("mobile",mobile);
                  //jsonData+= id+" "+name+" "+mobile+"\n";
                  studList.add("\n"+String.valueOf(obj));
                System.out.println(obj);



            }
            //System.out.println(jsonData);
            fileWriter.write(studList.toString());
            fileWriter.close();
            System.out.println("Done........");
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void transferCsvToJsonFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            FileWriter fileWriter = new FileWriter("D:\\testCsvToJson.json");
            String jsonData="";
            JSONObject obj=new JSONObject();
            Set<String> studList=new LinkedHashSet<>();

            while ((line = bufferedReader.readLine()) != null) {

                String splitRecord[] = line.split(" ");
                String id = splitRecord[0];
                String name=splitRecord[1];
                String mobile=splitRecord[2];
                obj.put("name",name);
                obj.put("id",id);

                obj.put("mobile",mobile);
                //jsonData+= id+" "+name+" "+mobile+"\n";
                studList.add("\n"+String.valueOf(obj));
                System.out.println(obj);



            }
            //System.out.println(jsonData);
            fileWriter.write(studList.toString());
            fileWriter.close();
            System.out.println("Done........");
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void transferXmlToJsonFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            FileWriter fileWriter = new FileWriter("D:\\testXmlToJson.json");
            String xmlData="";

            JSONObject obj=new JSONObject();
            Set<String> studList=new LinkedHashSet<>();

            while ((line = bufferedReader.readLine()) != null)
                 xmlData+= line;

            System.out.println(xmlData);

            ///JSONObject json = XML.toJSONObject(xml);
           // String jsonString = json.toString(4);
           /// System.out.println(jsonString);
            fileWriter.write(xmlData);
            fileWriter.close();
            System.out.println("Done........");
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void transferJsonToTextFile(String fileName) {

    }
        public static void main(String[] args) {
        String textFile="D:\\task.txt";
        //String csvFile="D:\\taskCsv.csv";
        //String xmlFile="D:\\taskXml.xml";
        transferTextToJsonFile(textFile);
        //transferCsvToJsonFile(csvFile);
        //transferXmlToJsonFile(xmlFile);

       // transferJsonToTextFile(fileName);


    }
}
