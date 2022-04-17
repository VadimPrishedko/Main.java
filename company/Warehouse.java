package com.company;

import java.util.Arrays;

public class Warehouse {
    private int numberBoxes;
    private Box[] warehouse;

    public Warehouse(int numberBoxes) {
        try {
            if (numberBoxes <= 0) {
                throw new ArithmeticException("Должен быть больше 0");
            }
            this.numberBoxes = numberBoxes;
            warehouse = new Box[numberBoxes];
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addBox (Box box, int count) {
        try {
            if (count >= numberBoxes ){
                throw new ArrayIndexOutOfBoundsException("Нет места");
            }

            warehouse[count] = box;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(warehouse);
    }

}
