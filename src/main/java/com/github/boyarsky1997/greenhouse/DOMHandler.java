package com.github.boyarsky1997.greenhouse;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMHandler {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src\\main\\resources\\greenhouse.xml"));

        document.getDocumentElement().normalize();

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        NodeList nList = document.getElementsByTagName("flowers");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            System.out.println("============================");
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Flowers  " + eElement.getElementsByTagName("flowers").item(0));
                System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Soil : " + eElement.getElementsByTagName("soil").item(0).getTextContent());
                System.out.println("Origin : " + eElement.getElementsByTagName("origin").item(0).getTextContent());
                System.out.println(eElement.getElementsByTagName("visual").item(0).getNodeName());
                System.out.println("Stem Color : " + eElement.getElementsByTagName("stem_color").item(0).getTextContent());
                System.out.println("Leaf Color : " + eElement.getElementsByTagName("leaf_color").item(0).getTextContent());
                System.out.println("Average Plant Size : " + eElement.getElementsByTagName("average_plant_size").item(0).getTextContent());
                System.out.println(eElement.getElementsByTagName("growingTips").item(0).getNodeName());
                System.out.println("Temperature : " + eElement.getElementsByTagName("temperature").item(0).getTextContent());
                System.out.println("Lighting : " + eElement.getElementsByTagName("lighting").item(0).getTextContent());
                System.out.println("Watering : " + eElement.getElementsByTagName("watering").item(0).getTextContent());
                System.out.println("Multiplying : " + eElement.getElementsByTagName("multiplying").item(0).getTextContent());
            }
        }
    }
}
