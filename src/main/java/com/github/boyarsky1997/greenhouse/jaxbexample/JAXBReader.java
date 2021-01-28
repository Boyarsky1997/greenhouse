package com.github.boyarsky1997.greenhouse.jaxbexample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBReader {
    public static void main(String[] args) throws JAXBException {
        File file = new File("src\\main\\java\\com\\github\\boyarsky1997\\greenhouse\\jaxbexample\\jaxbwrite.xml");
        JAXBContext context = JAXBContext.newInstance(Plants.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Plants plants = (Plants) unmarshaller.unmarshal(file);
        System.out.println(plants.flowers);
    }

}
