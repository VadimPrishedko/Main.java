package com.company;

import com.company.characteristics.Colour;
import com.company.characteristics.Material;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int iterations = 5;
        box(iterations);
        materialChange();
        colorChange();
    }

    public static void box(int iterations) {
        for (int i = 0; i < iterations; i++) {
            Random random = new Random();
            int value = random.nextInt(1, 10);
            int value2 = random.nextInt(1, 10);
            int value3 = random.nextInt(1, 10);

            Box box = new Box(value, value2, value3);
            System.out.println("Объём коробки " + (i + 1) + " = " + box.volumeCalc() + " м3");
        }
    }

    public static void materialChange() {
        Box box = new Box(2, 3, 4,  Material.WOOD);
        Material materialBox = Material.IRON;
        System.out.println("Заменили материал коробки, теперь material = " + materialBox.getVelue());
    }
    public static void colorChange() {
        ColorBox box = new ColorBox(2,3,4, Material.WOOD, Colour.BLACK);
        Colour color = Colour.PINK;
        System.out.println("Заменили цвет коробки, теперь color = " + color.getVelue());
    }


}


