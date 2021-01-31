package com.github.boyarsky1997.greenhouse.domhandler;

import com.github.boyarsky1997.greenhouse.GrowingTips;
import com.github.boyarsky1997.greenhouse.Visual;

public class Flower {
    private String name;
    private String soil;
    private String origin;
    private Visual visual;
    private GrowingTips growingTips;
    private String multiplying;

    public Flower() {
    }

    public Flower(String name, String soil, String origin, String multiplying, Visual visual, GrowingTips growingTips) {
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.multiplying = multiplying;
        this.visual = visual;
        this.growingTips = growingTips;
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

    public Visual getVisual() {
        return visual;
    }

    public void setVisual(Visual visual) {
        this.visual = visual;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", soil='" + soil + '\'' +
                ", origin='" + origin + '\'' +
                ", visual=" + visual +
                ", growingTips=" + growingTips +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }
}
