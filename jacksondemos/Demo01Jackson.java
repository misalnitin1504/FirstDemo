package com.prominentpixel.jacksondemos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo01Jackson {
    public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
        // create a JSON string of employee details to deserialize object
        String empString ="{\"01 Nitin Misal Developer 8905674813 misalnitin.beit@gmail.com  \\n02 Sachin Misal Developer 8805674813 misalsachin.beit@gmail.com \\n03 Aryan Misal Developer  8705674813 misalaryan.beit@gmail.com  \\n04 Kuldeep rupara Developer  8605674813 kuldeep.beit@gmail.com\"}";
        try{
            // use ObjectMapper for mapping JSON to Employee
            Employees employees = mapper.readValue(empString, Employees.class);
            // print employees
            System.out.println(employees);
            // serialize employees into json string
            empString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
            System.out.println(empString);

        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
