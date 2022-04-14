package com.company;

import com.company.characteristics.Colour;
import com.company.characteristics.Material;


public class ColorBox extends Box{
    private Colour colors;


    public ColorBox() {
    }


    public ColorBox(int height, int width, int length, Material material, Colour colors) {
        super(height, width, length, material);
        this.colors = colors;
    }

    public ColorBox(Colour colors) {
        this.colors = colors;
    }

    public Colour getColor() {
        return colors;
    }

    public void setColor(Colour color) {
        this.colors = colors;
    }
}
