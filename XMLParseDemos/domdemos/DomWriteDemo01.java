package com.prominentpixel.XMLParseDemos.domdemos;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DomWriteDemo01 {

    public static void main(String argv[]) {

        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("Class");
            doc.appendChild(rootElement);

            // student element
            Element student = doc.createElement("Student");
            rootElement.appendChild(student);

            // setting attribute to element
            Attr attr = doc.createAttribute("id");
            attr.setValue("01");
            student.setAttributeNode(attr);

            // name element
            Element  name = doc.createElement("name");
           // Attr attrType = doc.createAttribute("type");
            //attrType.setValue("formula one");
           // carname.setAttributeNode(attrType);
            name.appendChild(doc.createTextNode("nitin"));
            student.appendChild( name);
            // name element
            Element  address = doc.createElement("address");
            // Attr attrType = doc.createAttribute("type");
            //attrType.setValue("formula one");
            // carname.setAttributeNode(attrType);
            address.appendChild(doc.createTextNode("137-A, avirbhav society"));
            student.appendChild( address);



            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("writeDom.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}