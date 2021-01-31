package com.github.boyarsky1997.greenhouse.saxhandler;

public class Flower {
    private String name;
    private String soil;
    private String origin;
    private String multiplying;

    public Flower(String name, String soil, String origin, String multiplying) {
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.multiplying = multiplying;
    }

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }
}
