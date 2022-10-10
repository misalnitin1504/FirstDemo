package com.jsondemos;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToJsonUseJacksonDemo {
    public static void main(String[] args) throws IOException {
        Student s1=new Student(01,"Nitin",50000,"8905674813",88.88f,true,'M');
        Student s2=new Student(02,"Sachin",60000,"8805674813",99.88f,true,'M');
        Student s3=new Student(03,"Dipika",70000,"8705674813",77.88f,true,'F');
        Student s4=new Student(02,"Dhruva",80000,"8905674813",99.88f,true,'M');
        List<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("D:\\newStudent.json"), studentList);
        System.out.println("Done...........");


    }
}
