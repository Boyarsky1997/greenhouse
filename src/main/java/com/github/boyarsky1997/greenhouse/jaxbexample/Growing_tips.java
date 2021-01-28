package com.github.boyarsky1997.greenhouse.jaxbexample;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "growing_tips")
@XmlType(propOrder = {"temperature", "lighting", "watering"})

public class Growing_tips {
    private double temperature;
    private String lighting;
    private double watering;

    public double getTemperature() {
        return temperature;
    }

    @XmlElement
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLighting() {
        return lighting;
    }

    @XmlElement
    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public double getWatering() {
        return watering;
    }

    @XmlElement
    public void setWatering(double watering) {
        this.watering = watering;
    }

    @Override
    public String toString() {
        return "Growing_tips{" +
                "temperature=" + temperature +
                ", lighting='" + lighting + '\'' +
                ", watering=" + watering +
                '}';
    }
}