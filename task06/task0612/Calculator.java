package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int n = a + b;//напишите тут ваш код
        return n;
    }

    public static int minus(int a, int b) {
        int n = a - b;
        //напишите тут ваш код
        return n;
    }

    public static int multiply(int a, int b) {
        int n = a * b;
        //напишите тут ваш код
        return n;
    }

    public static double division(int a, int b) {
        double n = (double) a / b;
        //напишите тут ваш код
        return n;
    }

    public static double percent(int a, int b) {
        double n = (double)(b * a) / 100;
        //напишите тут ваш код
        return n;
    }

    public static void main(String[] args) {

    }
}