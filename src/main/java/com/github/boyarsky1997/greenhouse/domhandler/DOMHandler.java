package com.github.boyarsky1997.greenhouse.domhandler;

import com.github.boyarsky1997.greenhouse.Flowers;
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
        Flowers flowers = dOMParser(new File("src\\main\\resources\\greenhouse.xml"));
        System.out.println(flowers);
    }

    public static Flowers dOMParser(File file) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);

        document.getDocumentElement().normalize();

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        NodeList nList = document.getElementsByTagName("flowers");

        Flowers flowers = new Flowers();

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Flower flower = new Flower();
                Element eElement = (Element) node;
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                flower.setName(name);
                String soil = eElement.getElementsByTagName("soil").item(0).getTextContent();
                flower.setSoil(soil);
                String origin = eElement.getElementsByTagName("origin").item(0).getTextContent();
                flower.setOrigin(origin);
                String stem_color = eElement.getElementsByTagName("stem_color").item(0).getTextContent();
                Visual visual = new Visual();
                visual.setStem_color(stem_color);
                String leaf_color = eElement.getElementsByTagName("leaf_color").item(0).getTextContent();
                visual.setLeaf_color(leaf_color);
                String average_plant_size = eElement.getElementsByTagName("average_plant_size").item(0).getTextContent();
                visual.setAverage_plant_size(Double.parseDouble(average_plant_size));
                flower.setVisual(visual);
                GrowingTips growingTips = new GrowingTips();
                String temperature = eElement.getElementsByTagName("temperature").item(0).getTextContent();
                growingTips.setTemperature(Double.parseDouble(temperature));
                String lighting = eElement.getElementsByTagName("lighting").item(0).getTextContent();
                growingTips.setLighting(lighting);
                String watering = eElement.getElementsByTagName("watering").item(0).getTextContent();
                growingTips.setWatering(Double.parseDouble(watering));
                flower.setGrowingTips(growingTips);
                String multiplying = eElement.getElementsByTagName("multiplying").item(0).getTextContent();
                flower.setMultiplying(multiplying);

                flowers.add(flower);
            }
        }
        return flowers;
    }
}
