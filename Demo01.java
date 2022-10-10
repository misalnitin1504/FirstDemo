package com.jsondemos;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        JSONObject obj=new JSONObject();
        obj.put("name","sonoo");
        obj.put("age",new Integer(27));
        obj.put("salary",new Double(600000));
        System.out.println(obj);
        String jsonText = JSONValue.toJSONString(obj);
        //String jsonText1 = JSONArray.toJSONString((List) obj);

        System.out.println(jsonText);
        FileWriter fileWriter = new FileWriter("D:\\testJson.json");
        fileWriter.write(jsonText);
        fileWriter.close();


    }
}
