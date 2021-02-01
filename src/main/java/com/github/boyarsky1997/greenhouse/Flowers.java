package com.github.boyarsky1997.greenhouse;

import com.github.boyarsky1997.greenhouse.domhandler.Flower;

import java.util.ArrayList;

public class Flowers {
    private ArrayList<com.github.boyarsky1997.greenhouse.domhandler.Flower> flowers = new ArrayList<com.github.boyarsky1997.greenhouse.domhandler.Flower>();

    public Flowers() {
    }

    public void add(com.github.boyarsky1997.greenhouse.domhandler.Flower flower) {
        flowers.add(flower);
    }

    public ArrayList<com.github.boyarsky1997.greenhouse.domhandler.Flower> getFlowers() {
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
