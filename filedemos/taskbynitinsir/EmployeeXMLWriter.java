package com.prominentpixel.filedemos.taskbynitinsir;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;

import static com.prominentpixel.filedemos.EmployeeSalaryTasks.createXmlElement;

public class EmployeeXMLWriter {
    //String fileName="";
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    String line = null;

    File file = null;
    FileOutputStream myWriter = null;
    String temp = null;

    StringWriter stringWriter = null;

    XMLOutputFactory xMLOutputFactory = null;
    XMLStreamWriter xMLStreamWriter =null;


    public void init(String fileName) throws FileNotFoundException, XMLStreamException {
        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        file = new File("D:\\writeStAX.xml");
        myWriter = new FileOutputStream(file);
        stringWriter = new StringWriter();
        xMLOutputFactory = XMLOutputFactory.newInstance();
        xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
        xMLStreamWriter.writeStartDocument();
        xMLStreamWriter.writeStartElement("Employees");

    }



    public void process() throws IOException, XMLStreamException {
        while ((line = bufferedReader.readLine()) != null) {

            //System.out.println(line);
            createXmlElement(line,xMLStreamWriter);
        }

    }
    public void close() throws IOException, XMLStreamException {

        xMLStreamWriter.writeEndElement();
        xMLStreamWriter.writeEndDocument();
        xMLStreamWriter.close();
        //xMLOutputFactory.c
        String xmlString = stringWriter.getBuffer().toString();
        System.out.println(xmlString);

        myWriter.write(xmlString.getBytes());

        stringWriter.close();
        myWriter.close();
        System.out.println("\nSuccessfully wrote to the file.");

        //file.
        bufferedReader.close();
        fileReader.close();

    }
}
