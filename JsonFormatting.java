package com.jsondemos;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
//import org.codehaus.jackson.node.ObjectNode;
//import org.codehaus.jackson.JsonNode;


import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.databind.*;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JsonFormatting {

    public static void transferXmlToJsonUseJackson( String fileName) throws IOException {
        String data = "";
        try
        {
            // Read the .xml file
            data = FileUtils.readFileToString(new File(fileName), "UTF-8");

            // Create a new XmlMapper to read XML tags
            XmlMapper xmlMapper = new XmlMapper();

            //Reading the XML
            JsonNode jsonNode = xmlMapper.readTree(data.getBytes());
            /*
            for (JsonNode studentNode : jsonNode) {
                if (studentNode instanceof ObjectNode) {
                    ObjectNode object = (ObjectNode) studentNode;
                    object.remove("mobile");
                    //object.remove("middleName");
                }
            }*/
            for (JsonNode node : jsonNode) {
                //((ObjectNode)node).remove("name");
                //((ObjectNode)node).remove("middleName");
            }
            //Create a new ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            String value = objectMapper.writeValueAsString(jsonNode);
            objectMapper.writeValue(new File("D:\\data1.json"), jsonNode);

            System.out.println("*** Converting XML to JSON ***");
            System.out.println(value);
            FileWriter fileWriter = new FileWriter("D:\\testXmlToJson.json");
            fileWriter.write(value);
            System.out.println("Done.........");
            fileWriter.close();


        } catch (JsonParseException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

}
public static void transferJsonToXmlUseJackson(String fileName) throws IOException {
    //final String jsonStr = "{\"name\":\"JSON\",\"integer\":1,\"double\":2.0,\"boolean\":true,\"nested\":{\"id\":42},\"array\":[1,2,3]}";
    String data = FileUtils.readFileToString(new File(fileName), "UTF-8");
    ObjectMapper jsonMapper = new ObjectMapper();
    JsonNode node = jsonMapper.readValue(data, JsonNode.class);
    XmlMapper xmlMapper = new XmlMapper();
    xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
    xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
    StringWriter sw = new StringWriter();
    xmlMapper.writeValue(sw, node);

    System.out.println(sw.toString());
    FileWriter fileWriter = new FileWriter("D:\\testJsonToXml.xml");
    System.out.println("*** Converting Json to XML ***");
    fileWriter.write(sw.toString());
    System.out.println("Done.........");
    fileWriter.close();
}
    public static void transferCsvToJsonUseJackson(String fileNme){
        File input = new File(fileNme);
        try {
            CsvSchema csv = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            MappingIterator<Map<?, ?>> mappingIterator =  csvMapper.reader().forType(Map.class).with(csv).readValues(input);
            List<Map<?, ?>> list = mappingIterator.readAll();
            System.out.println(list);
            FileWriter fileWriter = new FileWriter("D:\\testCsvToJson.json");
            fileWriter.write(list.toString());
            System.out.println("Done.........");
            fileWriter.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


public static void transferJsonToCsvUseJackson(String fileName) throws IOException {
    JsonNode jsonNode = new ObjectMapper().readTree(new File(fileName));

    CsvSchema.Builder builder = CsvSchema.builder()
            .addColumn("id").addColumn("name").addColumn("mobile");


    CsvSchema csvSchema = builder.build().withHeader();

    CsvMapper csvMapper = new CsvMapper();
    csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
    csvMapper.writerFor(JsonNode.class)
            .with(csvSchema)
            .writeValue(new File("D:\\testJsonToCsv.csv"), jsonNode);
}
    public static void removeNodes(String filePath, String...nodeNames) { //nodenames
        // read file
        try (FileReader fileReader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            // parse the json file as json object
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            // create stream of nodes you want to remove
            Stream<String> nodeStream = Stream.of(nodeNames);//nodeNames
            // remove the node
            nodeStream.forEach(jsonObject::remove);
            // pretty print for proper indentation
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonObjectPrettified = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
            // write data to output file
            FileWriter fileWriter = new FileWriter(filePath.split("\\.")[0] + "_modified.json");
            fileWriter.write(jsonObjectPrettified);
            fileWriter.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
public static void removeNode() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.readTree(new File("D:\\data1.json"));
    System.out.println(jsonNode.get("Student").get(0).get("id"));


    System.out.println(jsonNode.get("Student").get(0).get("name"));

     ArrayNode studList= (ArrayNode) jsonNode.get("Student");
    for (JsonNode node : studList ) {
        ObjectNode object = (ObjectNode) node;
        System.out.println(object.get("name"));
        //JsonNode name = object.get("name");
        if (object.get("name").textValue().equals("Nitin")) {
            //object.remove("mobile");//can remove attribute
            object.put("mobile","8888888888"); //change field value
            object.put("plotNo","137-A");//can add new attribute
        }
        }
    objectMapper.writeValue(new File("D:\\data2.json"), jsonNode);

}
    public static void createJsonFileForEachLine(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(line);
            String newFileName= String.valueOf(jsonNode.get("Id").textValue());
            //objectMapper.writeValue(new File("D:\\jsonFiles\\"+newFileName+".json"), jsonNode);

            if (jsonNode.get("Id").textValue().equals("0032M00003W8xMOQAZ")){
                //System.out.println(jsonNode.get("MailingCountry"));
                System.out.println(jsonNode.get("MailingAddress").get("country"));
            }
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        //transferXmlToJsonUseJackson("D:\\Students.xml");
        //transferJsonToXmlUseJackson("D:\\testXmlToJson.json");
        //transferCsvToJsonUseJackson("D:\\sample1.csv");
        //transferJsonToCsvUseJackson("D:\\testJson.json");
        //removeNodes("D:\\data1.json","mobile","name");
        //removeNode();
        createJsonFileForEachLine("D:\\22d6140a-adda-337b-86a0-7d72a7ab3ab5-2022-08-01T18_50_23.json");

    }
}
