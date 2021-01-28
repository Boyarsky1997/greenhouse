package com.github.boyarsky1997.greenhouse;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMVersion {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document parse = documentBuilder.parse(new File("src\\main\\resources\\greenhouse.xml"));

        Element documentElement = parse.getDocumentElement();
        System.out.println(documentElement.getTagName());
        printElements(documentElement.getChildNodes());
    }

    static void printElements( NodeList childNodes ){
        for (int i = 0; i<childNodes.getLength(); i++){
            if (childNodes.item(i)instanceof Element) {
                System.out.println(((Element) childNodes.item(i)).getTagName());
                if (childNodes.item(i).hasChildNodes()){
                    printElements(childNodes.item(i).getChildNodes());
                }
            }
        }
    }
}
