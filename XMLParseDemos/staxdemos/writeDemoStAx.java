package com.prominentpixel.XMLParseDemos.staxdemos;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

public class writeDemoStAx {
    public static void main(String[] args) {
        try {
            StringWriter stringWriter = new StringWriter();

            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter =
                    xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("Class");

            xMLStreamWriter.writeStartElement("Student");
            xMLStreamWriter.writeAttribute("id", "01");

            xMLStreamWriter.writeStartElement("name");
            //xMLStreamWriter.writeAttribute("type", "formula one");
            xMLStreamWriter.writeCharacters("Nitin");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("address");
            //xMLStreamWriter.writeAttribute("type", "formula one");
            xMLStreamWriter.writeCharacters("137-A, Avirbhav Society");
            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndElement();


            xMLStreamWriter.writeStartElement("Student");
            xMLStreamWriter.writeAttribute("id", "02");

            xMLStreamWriter.writeStartElement("name");
            //xMLStreamWriter.writeAttribute("type", "formula one");
            xMLStreamWriter.writeCharacters("Yati");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("address");
            //xMLStreamWriter.writeAttribute("type", "formula one");
            xMLStreamWriter.writeCharacters("137-B, Olpad Society");
            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndElement();

/*
            xMLStreamWriter.writeStartElement("carname");
            xMLStreamWriter.writeAttribute("type", "sports");
            xMLStreamWriter.writeCharacters("Ferrari 202");
            xMLStreamWriter.writeEndElement();
*/
            xMLStreamWriter.writeEndDocument();

            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            String xmlString = stringWriter.getBuffer().toString();

            stringWriter.close();

            System.out.println(xmlString);
            File file=new File("writeStAX.xml");
            FileOutputStream myWriter = new FileOutputStream(file);
            //FileWriter myWriter = new FileWriter(file);
            //myWriter.write("Files in Java might be tricky, but it is fun enough!");
            //String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

            byte[] strToBytes = xmlString.getBytes();
            myWriter.write(strToBytes);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (XMLStreamException ex) {
            throw new RuntimeException(ex);
        }



    }
}
