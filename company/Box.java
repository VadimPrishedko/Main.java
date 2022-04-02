package com.company;

public class Box {
    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int volumeCalc() {
        return height * width * length;
    }

}

