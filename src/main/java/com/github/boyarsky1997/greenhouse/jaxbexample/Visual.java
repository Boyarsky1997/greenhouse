package com.github.boyarsky1997.greenhouse.jaxbexample;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "visual")
@XmlType(propOrder = {"stem_color", "leaf_color", "average_plant_size"})
public class Visual {
    private String stem_color;
    private String leaf_color;
    private double average_plant_size;

    public String getStem_color() {
        return stem_color;
    }

    @XmlElement
    public void setStem_color(String stem_color) {
        this.stem_color = stem_color;
    }

    public String getLeaf_color() {
        return leaf_color;
    }

    @XmlElement

    public void setLeaf_color(String leaf_color) {
        this.leaf_color = leaf_color;
    }

    public double getAverage_plant_size() {
        return average_plant_size;
    }

    @XmlElement
    public void setAverage_plant_size(double average_plant_size) {
        this.average_plant_size = average_plant_size;
    }

    @Override
    public String toString() {
        return "Visual{" +
                "stem_color='" + stem_color + '\'' +
                ", leaf_color='" + leaf_color + '\'' +
                ", average_plant_size=" + average_plant_size +
                '}';
    }
}
