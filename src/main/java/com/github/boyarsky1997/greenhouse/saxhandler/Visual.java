package com.github.boyarsky1997.greenhouse.saxhandler;

public class Visual {
    private String stem_color;
    private String leaf_color;
    private double average_plant_size;

    public Visual() {
    }

    public Visual(String stem_color, String leaf_color, double average_plant_size) {
        this.stem_color = stem_color;
        this.leaf_color = leaf_color;
        this.average_plant_size = average_plant_size;
    }

    public String getStem_color() {
        return stem_color;
    }

    public void setStem_color(String stem_color) {
        this.stem_color = stem_color;
    }

    public String getLeaf_color() {
        return leaf_color;
    }

    public void setLeaf_color(String leaf_color) {
        this.leaf_color = leaf_color;
    }

    public double getAverage_plant_size() {
        return average_plant_size;
    }

    public void setAverage_plant_size(double average_plant_size) {
        this.average_plant_size = average_plant_size;
    }
}
