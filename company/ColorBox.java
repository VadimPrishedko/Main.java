package com.company;

import com.company.characteristics.Colour;
import com.company.characteristics.Material;


public class ColorBox extends Box{
    private Colour colors;


    public ColorBox() {
    }


    public ColorBox(int height, int width, int length, Material material, Colour colors) {
        super(height, width, length, material);
        try {
            if(colors == null){
                throw new NullPointerException("Цвет не задан");
            }
            this.colors = colors;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return
                "высота = " + getHeight() + "\n"+
                "ширина = " + getWidth() + "\n"+
                "длина = " + getLength() + "\n"+
                "материал = " + material + "\n"+
                "цвет = " + colors + "\n";

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
