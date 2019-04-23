package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat (String name) {
        this.name = name;
        this.age = 1;
        this.color = "Green";
        this.weight = 80;
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "Green";
        this.weight = weight;
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "Green";
        this.weight = 80;
    }

    public Cat (int weight, String color) {
        this.age = 1;
        this.color = color;
        this.weight = weight;
    }

    public Cat (int weight, String color, String address) {
        this.age = 1;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
