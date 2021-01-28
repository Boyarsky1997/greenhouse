package com.github.boyarsky1997.greenhouse.jaxbexample;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "flower")
@XmlType(propOrder = {"name", "soil", "origin", "visual", "growingTips", "multiplying"})
public class Flower {
    String name;
    String soil;
    String origin;
    Visual visual;
    Growing_tips growing_tips;
    String multiplying;

    public Flower() {
    }

    public Flower(String name, String soil, String origin, Visual visual, Growing_tips growing_tips, String multiplying) {
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.visual = visual;
        this.growing_tips = growing_tips;
        this.multiplying = multiplying;
    }

    public Growing_tips getGrowingTips() {
        return growing_tips;
    }

    @XmlElement()
    public void setGrowingTips(Growing_tips growing_tips) {
        this.growing_tips = growing_tips;
    }

    public Visual getVisual() {
        return visual;
    }

    @XmlElement
    public void setVisual(Visual visual) {
        this.visual = visual;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    @XmlElement()
    public void setSoil(String soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    @XmlElement
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMultiplying() {
        return multiplying;
    }

    @XmlElement
    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", soil='" + soil + '\'' +
                ", origin='" + origin + '\'' +
                ", visual=" + visual +
                ", growing_tips=" + growing_tips +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }
}
