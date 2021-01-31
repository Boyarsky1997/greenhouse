package com.github.boyarsky1997.greenhouse.domhandler;

import java.util.ArrayList;

public class Flowers {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public Flowers() {
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "flowers=" + flowers +
                '}';
    }
}
