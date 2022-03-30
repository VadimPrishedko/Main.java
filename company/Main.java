package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int i = 0;
        int number = getValue(i);
        int degree = getValue(i+1);

        int operant = 1;
        int result = Operation(number, degree, operant);
        System.out.println("Результат: " + result);
    }

    public static int getValue(int i) {
        if (i == 0) {
            System.out.println("Введите число: ");
        } else {
            System.out.println("Введите степень: ");
        }

        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();

        } else {
            System.out.println("Некорректный ввод");
        }
        return num;
    }

    public static int Operation(int number, int degree, int operant) {
        if (degree == 0) {
            return operant;
        }
        return Operation(number, degree - 1, operant *= number);

    }
}


//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int a = getValue();
//        int b = getValue();
//        char operation = Operation();
//        int result = calc(a, b, operation);
//        System.out.println("Результат: " + result);
//    }
//
//    public static int getValue() {
//        System.out.println("Введите число: ");
//        int operand = 0;
//        if (scanner.hasNextInt()) {
//            operand = scanner.nextInt();
//        } else {
//            System.out.println("Некорректный ввод");
//            System.exit(0);
//        }
//        return operand;
//    }
//
//    public static char Operation() {
//        System.out.println("Введите операцию: ");
//
//        String operation = scanner.next();
//        char op = operation.charAt(0);
//
//        if (op == '+' || op == '-' || op == '*' || op == '/') {
//        } else {
//            System.out.println("Некорректный ввод");
//            System.exit(0);
//        }
//        return op;
//    }
//
//    public static int calc(int a, int b, char operation) {
//        int result = 0;
//        switch (operation) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                result = a / b;
//                break;
//            default:
//                System.out.println("Некорректный ввод");
//                System.exit(0);
//        }
//        return result;