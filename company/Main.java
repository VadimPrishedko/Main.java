package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int iterations = 5;
        box(iterations);
        materialChange();
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
        Box box = new Box(2, 3, 4, "Белый", "дерево");
        box.setMaterial("железо");
        System.out.println("Заменили материал коробки, теперь material = " + box.getMaterial());
    }


}


