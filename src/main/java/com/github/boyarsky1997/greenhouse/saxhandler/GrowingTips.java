package com.github.boyarsky1997.greenhouse.saxhandler;

public class GrowingTips {
    private double temperature;
    private String lighting;
    private double watering;

    public GrowingTips() {
    }

    public GrowingTips(double temperature, String lighting, double watering) {
        this.temperature = temperature;
        this.lighting = lighting;
        this.watering = watering;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public double getWatering() {
        return watering;
    }

    public void setWatering(double watering) {
        this.watering = watering;
    }

    @Override
    public String toString() {
        return "GrowingTips{" +
                "temperature=" + temperature +
                ", lighting='" + lighting + '\'' +
                ", watering=" + watering +
                '}';
    }
}