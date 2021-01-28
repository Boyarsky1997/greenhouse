package com.github.boyarsky1997.greenhouse.jaxbexample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class JAXBWriter {
    public static void main(String[] args) throws JAXBException {
        try {
            Plants plants = new Plants();
            ArrayList<Flower> flowers = new ArrayList<Flower>();
            Flower flower1 = new Flower();
            flower1.setName("Кактус");
            flower1.setSoil("Коричневий");
            flower1.setOrigin("Мексика");
            Visual visual1 = new Visual();
            visual1.setStem_color("Зелений");
            visual1.setLeaf_color("Зелений");
            visual1.setAverage_plant_size(20.0);
            flower1.setVisual(visual1);
            Growing_tips growingTips1 = new Growing_tips();
            growingTips1.setTemperature(35);
            growingTips1.setLighting("yes");
            growingTips1.setWatering(15);
            flower1.setGrowingTips(growingTips1);
            flower1.setMultiplying("зернами");
            flowers.add(flower1);
            Flower flower2 = new Flower();
            flower2.setName("Фі́кус");
            flower2.setSoil("Чорнозем");
            flower2.setOrigin("Азія");
            Visual visual2 = new Visual();
            visual2.setStem_color("Коричневий");
            visual2.setLeaf_color("Зелений");
            visual2.setAverage_plant_size(2);
            flower2.setVisual(visual2);
            Growing_tips growingTips2 = new Growing_tips();
            growingTips2.setTemperature(20);
            growingTips2.setLighting("no");
            growingTips2.setWatering(30);
            flower2.setGrowingTips(growingTips2);
            flower2.setMultiplying("пагінцями");
            flowers.add(flower2);
            plants.setFlowers(flowers);
            File file = new File("src\\main\\resources\\jaxbwrite.xml");
            JAXBContext context = JAXBContext.newInstance(Plants.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(plants, System.out);
            marshaller.marshal(plants, file);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
