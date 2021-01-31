package com.github.boyarsky1997.greenhouse.domhandler;

import com.github.boyarsky1997.greenhouse.GrowingTips;
import com.github.boyarsky1997.greenhouse.Visual;
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

        Flowers flowers = new Flowers();

        for (int temp = 0; temp < nList.getLength(); temp++) {
            System.out.println("============================");
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Flower flower = new Flower();
                Element eElement = (Element) node;
                System.out.println("Flowers  " + eElement.getElementsByTagName("flowers").item(0));
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                System.out.println("Name : " + name);
                flower.setName(name);
                String soil = eElement.getElementsByTagName("soil").item(0).getTextContent();
                System.out.println("Soil : " + soil);
                flower.setSoil(soil);
                String origin = eElement.getElementsByTagName("origin").item(0).getTextContent();
                System.out.println("Origin : " + origin);
                flower.setOrigin(origin);
                System.out.println(eElement.getElementsByTagName("visual").item(0).getNodeName());
                String stem_color = eElement.getElementsByTagName("stem_color").item(0).getTextContent();
                Visual visual = new Visual();
                visual.setStem_color(stem_color);
                System.out.println("Stem Color : " + stem_color);
                String leaf_color = eElement.getElementsByTagName("leaf_color").item(0).getTextContent();
                System.out.println("Leaf Color : " + leaf_color);
                visual.setLeaf_color(leaf_color);
                String average_plant_size = eElement.getElementsByTagName("average_plant_size").item(0).getTextContent();
                System.out.println("Average Plant Size : " + average_plant_size);
                visual.setAverage_plant_size(Double.parseDouble(average_plant_size));
                flower.setVisual(visual);
                System.out.println(eElement.getElementsByTagName("growingTips").item(0).getNodeName());
                GrowingTips growingTips = new GrowingTips();
                String temperature = eElement.getElementsByTagName("temperature").item(0).getTextContent();
                System.out.println("Temperature : " + temperature);
                growingTips.setTemperature(Double.parseDouble(temperature));
                String lighting = eElement.getElementsByTagName("lighting").item(0).getTextContent();
                System.out.println("Lighting : " + lighting);
                growingTips.setLighting(lighting);
                String watering = eElement.getElementsByTagName("watering").item(0).getTextContent();
                System.out.println("Watering : " + watering);
                growingTips.setWatering(Double.parseDouble(watering));
                flower.setGrowingTips(growingTips);
                String multiplying = eElement.getElementsByTagName("multiplying").item(0).getTextContent();
                System.out.println("Multiplying : " + multiplying);
                flower.setMultiplying(multiplying);

                flowers.add(flower);
            }
        }
        System.out.println(flowers);
    }
}
