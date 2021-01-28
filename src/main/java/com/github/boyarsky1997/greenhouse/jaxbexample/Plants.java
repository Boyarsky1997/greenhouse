package com.github.boyarsky1997.greenhouse.jaxbexample;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "plants")
public class Plants {
    ArrayList<Flower> flowers = new ArrayList<Flower>();

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    @XmlElement()
    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }
}
