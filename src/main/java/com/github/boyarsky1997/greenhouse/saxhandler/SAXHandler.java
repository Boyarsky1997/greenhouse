package com.github.boyarsky1997.greenhouse.saxhandler;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;

public class SAXHandler {

    private static final ArrayList<Flower> flowers = new ArrayList<Flower>();
    private static final ArrayList<Visual> visuals = new ArrayList<Visual>();
    private static final ArrayList<GrowingTips> growingTipsArrayList = new ArrayList<GrowingTips>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse("src\\main\\resources\\greenhouse.xml", handler);
        int count = 0;
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println("=================================");
            System.out.println("Name : " + flowers.get(i).getName());
            System.out.println("Soil : " + flowers.get(i).getSoil());
            System.out.println("Origin : " + flowers.get(i).getOrigin());
            System.out.println("Stem color : " + visuals.get(i).getStem_color());
            System.out.println("Leaf color : " + visuals.get(i).getLeaf_color());
            System.out.println("Average plant size : " + visuals.get(i).getAverage_plant_size());
            System.out.println("Temperature : " + growingTipsArrayList.get(i).getTemperature());
            System.out.println("Lighting : " + growingTipsArrayList.get(i).getLighting());
            System.out.println("Watering : " + growingTipsArrayList.get(i).getWatering());
            System.out.println("Multiplying : " + flowers.get(i).getMultiplying());
        }
    }

    private static class XMLHandler extends DefaultHandler {
        private String name, soil, origin, multiplying, stem_color, leaf_color, lighting, average_plant_size, temperature, watering;
        private String lastElementName;


        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((name != null && !name.isEmpty()) && (soil != null && !soil.isEmpty()) &&
                    (origin != null && !origin.isEmpty()) && (multiplying != null && !multiplying.isEmpty())) {
                flowers.add(new Flower(name, soil, origin, multiplying));
                name = null;
                soil = null;
                origin = null;
                multiplying = null;
                if ((stem_color != null && !stem_color.isEmpty()) && (leaf_color != null && !leaf_color.isEmpty()) &&
                        (average_plant_size != null && !average_plant_size.isEmpty())) {
                    visuals.add(new Visual(stem_color, leaf_color, Double.parseDouble(average_plant_size)));
                    stem_color = null;
                    leaf_color = null;
                    average_plant_size = null;
                }
                if ((temperature != null && !temperature.isEmpty()) && (lighting != null && !lighting.isEmpty()) &&
                        (watering != null && !watering.isEmpty())) {
                    growingTipsArrayList.add(new GrowingTips(Double.parseDouble(temperature), lighting, Double.parseDouble(watering)));
                    temperature = null;
                    lighting = null;
                    watering = null;

                }
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("name"))
                    name = information;
                if (lastElementName.equals("soil"))
                    soil = information;
                if (lastElementName.equals("origin"))
                    origin = information;
                if (lastElementName.equals("stem_color"))
                    stem_color = information;
                if (lastElementName.equals("leaf_color"))
                    leaf_color = information;
                if (lastElementName.equals("average_plant_size"))
                    average_plant_size = information;
                if (lastElementName.equals("temperature"))
                    temperature = information;
                if (lastElementName.equals("lighting"))
                    lighting = information;
                if (lastElementName.equals("watering"))
                    watering = information;
                if (lastElementName.equals("multiplying"))
                    multiplying = information;
            }
        }
    }
}