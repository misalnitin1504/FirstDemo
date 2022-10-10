package com.prominentpixel.jacksondemos;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) {
        // create an instance of ObjectMapper class
        ObjectMapper mapper = new ObjectMapper();
        // create a JSON string of employee details to deserilized object
        String stdString = "{\n\"students\" : [\n{\n\"stdId\":\"001\",\n\"course\":\"MCA\","+"\n\"firstName\":\"Nicholas\",\n\"lastName\":\"Clemens\",\n\"preferredFullName\":\"Nicholas Clemens\","+"\n\"enrol\":\"S010\",\n\"region\":\"indian\",\n\"phoneNumber\":\"408-1234567\",\n\"emailAddress\""+":\"nicholas.clemens@gmail.com\"\n},\n{\n\"stdId\":\"002\",\n\"course\":\"BCA\","+"\n\"firstName\":\"Sharon\",\n\"lastName\":\"Lorenz\",\n\"preferredFullName\":\"Sharon Lorenz\","+"\n\"enrol\":\"S011\",\n\"region\":\"indian\",\n\"phoneNumber\":\"408-1111111\",\n\"emailAddress\""+":\"sharon.lorenz@gmail.com\"\n},\n{\n\"stdId\":\"003\",\n\"course\":\"Btech\","+"\n\"firstName\":\"Brittany\",\n\"lastName\":\"Hart\",\n\"preferredFullName\":\"Brittany Hart\",\n\""+"enrol\":\"S012\",\n\"region\":\"indian\",\n\"phoneNumber\":\"408-2222222\",\n\"emailAddress\":\"brittany.hart@gmail.com\"\n}\n]\n}";

        try{
            // use ObjectMapper for mapping JSON to Student
            Students students = mapper.readValue(stdString, Students.class);

            // print students
            System.out.println(students);

            // serialize students into json string
            stdString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

            System.out.println(stdString);

        }catch (JsonParseException e) {
            e.printStackTrace();
        }catch (JsonMappingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}