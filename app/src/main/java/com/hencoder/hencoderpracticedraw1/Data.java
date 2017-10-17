package com.hencoder.hencoderpracticedraw1;

/**
 * Created by luqinmao on 2017/10/16.
 */

public class Data {

    private String name;
    private float number;
    private int color;

    public Data(String name, float number, int color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public float getNumber() {
        return number;
    }

    public int getColor() {
        return color;
    }
}