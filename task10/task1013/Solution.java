package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surName;
        private int age;
        private int height;
        private boolean married;
        private boolean hasChildrens;

        public Human (String name){
            this.name = name;
        }

        public Human (String name, String surName) {
            this.name = name;
            this.surName = surName;
        }

        public Human (String name, String surName, int age) {
            this.name = name;
            this.surName = surName;
            this.age = age;
        }

        public Human (String name, String surName, int age, int height) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.height = height;
        }

        public Human (String name, String surName, int age, int height, boolean married) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.height = height;
            this.married = married;
        }

        public Human (String name, String surName, int age, int height, boolean married, boolean hasChildrens) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.height = height;
            this.married = married;
            this.hasChildrens = hasChildrens;
        }

        public Human (String name, String surName, int height, boolean married, boolean hasChildrens) {
            this.name = name;
            this.surName = surName;
            this.height = height;
            this.married = married;
            this.hasChildrens = hasChildrens;
        }

        public Human (String name, String surName, boolean married, boolean hasChildrens) {
            this.name = name;
            this.surName = surName;
            this.married = married;
            this.hasChildrens = hasChildrens;
        }

        public Human (String name, int age, int height, boolean married, boolean hasChildrens) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.married = married;
            this.hasChildrens = hasChildrens;
        }

        public Human (String name, String surName, int height, boolean hasChildrens) {
            this.name = name;
            this.surName = surName;
            this.height = height;
            this.hasChildrens = hasChildrens;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
