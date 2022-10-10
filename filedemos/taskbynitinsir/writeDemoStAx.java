package com.prominentpixel.filedemos.taskbynitinsir;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;

public class writeDemoStAx {
    public static void writeToXmlUseStAX(String fileName) {

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            byte[] allData=null ;
            //System.out.println(xmlString);
            File file = new File("D:\\writeStAX.xml");
            FileOutputStream myWriter = new FileOutputStream(file);

            StringWriter stringWriter = new StringWriter();

            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter =
                    xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("Employees");
            while ((line = bufferedReader.readLine()) != null) {

                //System.out.println(line);
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
            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndDocument();

            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            String xmlString = stringWriter.getBuffer().toString();

            stringWriter.close();



            byte[] strToBytes =  xmlString.getBytes();
            //allData=allData+strToBytes;
            myWriter.write(strToBytes);
            myWriter.close();

            //myWriter.write(allData);
            System.out.println("\nSuccessfully wrote to the file.");
            //myWriter.close();

            bufferedReader.close();
            fileReader.close();

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String fileName="D:\\employeelist1.txt";
        writeToXmlUseStAX(fileName);




    }
}
