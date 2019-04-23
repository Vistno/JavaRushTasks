package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name, address, color;
    private int age, weight;

    public void initialize (String name) {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "Blue";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Green";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "Red";
    }

    public void initialize (int weight, String color) {
        this.age = 4;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
