package com.github.boyarsky1997.greenhouse.staxhandler;

import com.github.boyarsky1997.greenhouse.Flowers;
import com.github.boyarsky1997.greenhouse.GrowingTips;
import com.github.boyarsky1997.greenhouse.Visual;
import com.github.boyarsky1997.greenhouse.domhandler.Flower;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StAXHandler {
    private static Flower flower;
    private static Visual visual;
    private static GrowingTips growingTips;

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        Flowers flowers = stAXParser(new FileInputStream("src\\main\\resources\\greenhouse.xml"));
        System.out.println(flowers);

    }


    public static Flowers stAXParser(FileInputStream fileInputStream) throws XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(fileInputStream);

        Flowers flowers = new Flowers();
        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                switch (startElement.getName().getLocalPart()) {
                    case "flowers":
                        flower = new Flower();
                        break;
                    case "name":
                        nextEvent = reader.nextEvent();
                        flower.setName(nextEvent.asCharacters().getData());
                        break;
                    case "soil":
                        nextEvent = reader.nextEvent();
                        flower.setSoil(nextEvent.asCharacters().getData());
                        break;
                    case "origin":
                        nextEvent = reader.nextEvent();
                        flower.setOrigin(nextEvent.asCharacters().getData());
                        break;
                    case "visual":
                        visual = new Visual();
                        break;
                    case "stem_color":
                        nextEvent = reader.nextEvent();
                        visual.setStem_color(nextEvent.asCharacters().getData());
                        break;
                    case "leaf_color":
                        nextEvent = reader.nextEvent();
                        visual.setLeaf_color(nextEvent.asCharacters().getData());
                        break;
                    case "average_plant_size":
                        nextEvent = reader.nextEvent();
                        visual.setAverage_plant_size(Double.parseDouble(nextEvent.asCharacters().getData()));
                        flower.setVisual(visual);
                        break;
                    case "growingTips":
                        growingTips = new GrowingTips();
                        break;
                    case "temperature":
                        nextEvent = reader.nextEvent();
                        growingTips.setTemperature(Double.parseDouble(nextEvent.asCharacters().getData()));
                        break;
                    case "lighting":
                        nextEvent = reader.nextEvent();
                        growingTips.setLighting(nextEvent.asCharacters().getData());
                        break;
                    case "watering":
                        nextEvent = reader.nextEvent();
                        growingTips.setWatering(Double.parseDouble(nextEvent.asCharacters().getData()));
                        flower.setGrowingTips(growingTips);
                        break;
                    case "multiplying":
                        nextEvent = reader.nextEvent();
                        flower.setMultiplying(nextEvent.asCharacters().getData());
                        break;
                }
            }
            if (nextEvent.isEndElement()) {
                EndElement endElement = nextEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("multiplying")) {
                    flowers.add(flower);
                }
            }
        }
        return flowers;
    }
}