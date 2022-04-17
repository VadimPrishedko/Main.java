package com.company;

import com.company.characteristics.Material;


public class Box {
    private int height;
    private int width;
    private int length;
    protected Material material;

    public Box() {
    }

    public Box(int height, int width, int length) {
        try {
            if(height <= 0 ||  width <= 0 || length <=0){
                throw new ArithmeticException("Должен быть больше 0");
            }
            this.height = height;
            this.width = width;
            this.length = length;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }


    public Box(int height, int width, int length, Material material) {
        this(height, width, length);
        try {
            if(material == null){
                throw new NullPointerException("Материал не задан");
            }
            this.material = material;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public String toString() {
        return "высота = " + height + "\n"+
               "ширина = " + width + "\n"+
               "длина = " + length + "\n"+
               "материал = " + material + "\n";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else System.out.println("Значение не может быть <= 0");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else System.out.println("Значение не может быть <= 0");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else System.out.println("Значение не может быть <= 0");
    }

    public void getMaterial(Material material) {
        this.material = material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int volumeCalc() {
        return height * width * length;
    }

}

