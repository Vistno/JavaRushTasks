package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Yura", 23, "volkova");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Man man2 = new Man("Vasia", 27, "kosmonavtov");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Yulia", 20, "borko");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

        Woman woman2 = new Woman("Nuna", 17, "komarova");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);


        //напишите тут ваш код
    }

    public static class Man {
        String name, address;
        int age;

        public Man (String name){
            this.name = name;
            this.age = 0;
            this.address = " ";
        }

        public Man (String name, int age) {
            this.name = name;
            this.age = age;
            this.address = " ";
        }

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man (int age) {
            this.name = " ";
            this.age = age;
            this.address = " ";
        }

        public Man (int age, String address) {
            this.name = " ";
            this.age = age;
            this.address = address;
        }

        /*public Man (String address) {
            this.name = " ";
            this.age = 0;
            this.address = address;
        }*/
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman (String name){
            this.name = name;
            this.age = 0;
            this.address = " ";
        }

        public Woman (String name, int age) {
            this.name = name;
            this.age = age;
            this.address = " ";
        }

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman (int age) {
            this.name = " ";
            this.age = age;
            this.address = " ";
        }

        public Woman (int age, String address) {
            this.name = " ";
            this.age = age;
            this.address = address;
        }

        /*public Woman (String address) {
            this.name = " ";
            this.age = 0;
            this.address = address;
        }*/
    }

    //напишите тут ваш код
}
