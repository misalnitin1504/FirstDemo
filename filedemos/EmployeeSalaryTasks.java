package com.prominentpixel.filedemos;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.util.*;

public class EmployeeSalaryTasks {
    public static void findAverageSalary(String fileName){
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            int empNo=0;
            int sum=0;
            while ((line = bufferedReader.readLine()) != null) {
                empNo++;
                String splitRecord[] = line.split(" ");
                int salary = Integer.parseInt(splitRecord[3]);
                  sum=sum+salary;
            }
            int averageSalary=sum/empNo;
            System.out.println("Average Salary of all Employees="+averageSalary);
            fileReader.close();
            bufferedReader.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void findFebAverageSalary(String fileName){
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            int empNo=0;
            int sum=0;

            while ((line = bufferedReader.readLine()) != null) {

                String splitRecord[] = line.split(" ");
                int month = Integer.parseInt(splitRecord[5]);
                if(month==2){
                    empNo++;
                    int salary = Integer.parseInt(splitRecord[3]);
                    sum=sum+salary;
                }


            }
            int averageSalary=sum/empNo;
            System.out.println("Average Salary of February Month="+averageSalary);
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void findYearWiseAverageSalary(String fileName){
        FileReader fileReader= null;
        Map<Integer,Integer> hashMap=new HashMap<>();
        int year=0;
        int averageSalary=0;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            int empNo=0;
            int sum=0;

            while ((line = bufferedReader.readLine()) != null) {

                String splitRecord[] = line.split(" ");
                year = Integer.parseInt(splitRecord[6]);
                hashMap.put(year,averageSalary);

                if(hashMap.containsKey(year)){
                    empNo++;
                    int salary = Integer.parseInt(splitRecord[3]);
                    sum=sum+salary;
                    averageSalary=sum/empNo;
                    hashMap.put(year,averageSalary);

                }



            }

            System.out.println("Year-Wise Average salary:\n"+hashMap);
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void findEmpMaxBonus(String fileName){
        FileReader fileReader= null;
        Map<String,Integer> hashMapRecordBonus=new HashMap<>();
        Map<String,Integer> hashMapNameBonus=new HashMap<>();
        List<String> nameList=new ArrayList<>();
        List<String> maxBonusEmpList=new ArrayList<>();

        int count=1;

        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            int maxBonus=0;
            String employees[]=null;
            String maxBonusEmployee = null;
            while ((line = bufferedReader.readLine()) != null) {

                String splitRecord[] = line.split(" ");
                String name=splitRecord[1];
                int bonus = Integer.parseInt(splitRecord[4]);
                if(maxBonus<bonus ){
                    maxBonus=bonus;
                    //list.add(name);
                    maxBonusEmployee = line;


                    //count++;
                } //else {hashMap.get(bonus).add(line);}
                //hashMap.put(maxBonus, line);
                hashMapRecordBonus.put(line,bonus);
                hashMapNameBonus.put(name,bonus);

            }

            System.out.println("Max-Bonus="+maxBonus);
           // System.out.println("Employee="+maxBonusEmployee);

            for(Map.Entry m:hashMapNameBonus.entrySet()){
                //System.out.println(m.getKey()+" "+m.getValue());
                if (m.getValue().equals(maxBonus)){
                    //nameList.add((String) m.getKey());
                    nameList.add((String) m.getKey());

                }
            }
            for(Map.Entry m:hashMapRecordBonus.entrySet()){
                //System.out.println(m.getKey()+" "+m.getValue());
                if (m.getValue().equals(maxBonus)){
                    //nameList.add((String) m.getKey());
                    maxBonusEmpList.add((String) m.getKey());

                }
            }
            System.out.println("Name List:"+nameList);
            System.out.println("Employee List:"+maxBonusEmpList);



            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void createXmlElement(String line, XMLStreamWriter xMLStreamWriter) throws XMLStreamException {
        String splitRecord[] = line.split(" ");
        int id = Integer.parseInt(splitRecord[0]);
        String name = splitRecord[1];
        String mobile= splitRecord[2];
        int salary=Integer.parseInt(splitRecord[3]);
        int bonus=Integer.parseInt(splitRecord[4]);
        int month=Integer.parseInt(splitRecord[5]);
        int year=Integer.parseInt(splitRecord[6]);

        xMLStreamWriter.writeStartElement("Employee");
        xMLStreamWriter.writeAttribute("id", String.valueOf(id));
        xMLStreamWriter.writeStartElement("name");
        xMLStreamWriter.writeCharacters(name);
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeStartElement("mobile");
        xMLStreamWriter.writeCharacters(String.valueOf(mobile));
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeStartElement("salary");
        xMLStreamWriter.writeCharacters(String.valueOf(salary));
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeStartElement("bonus");
        xMLStreamWriter.writeCharacters(String.valueOf(bonus));
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeStartElement("month");
        xMLStreamWriter.writeCharacters(String.valueOf(month));
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeStartElement("year");
        xMLStreamWriter.writeCharacters(String.valueOf(year));
        xMLStreamWriter.writeEndElement();

        xMLStreamWriter.writeEndElement();
    }
    public static void writeToXmlUseStAX(String fileName) throws XMLStreamException, IOException {
        EmployeeXMLWriter employeeXMLWriter=new EmployeeXMLWriter();
        employeeXMLWriter.init(fileName);
        employeeXMLWriter.process();
        employeeXMLWriter.close();
    }

    public static void main(String[] args) throws XMLStreamException, IOException {
        String filename="D:\\employeelist1.txt";
        //findAverageSalary(filename);
        //findFebAverageSalary(filename);
        //findYearWiseAverageSalary(filename);
        //findEmpMaxBonus(filename);
        writeToXmlUseStAX(filename);

    }
}
