package com.jsondemos;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Demo02Array {
    public static void main(String[] args) throws IOException {
        JSONArray arr = new JSONArray();
        arr.add("sonoo");
        arr.add(new Integer(27));
        arr.add(new Double(600000));
        System.out.println(arr);
        String jsonText = String.valueOf(arr);
        String jsonText1 = JSONValue.toJSONString(arr);
        System.out.println(jsonText);
        System.out.println(jsonText1);
        FileWriter fileWriter = new FileWriter("D:\\testJson.json");
        fileWriter.write(jsonText);
        fileWriter.close();




    }
}
