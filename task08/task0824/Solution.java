package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Human son1 = new Human("Сергей", true, 25, new ArrayList<Human>());
        Human son2 = new Human("Роман", true, 20, new ArrayList<Human>());
        Human son3 = new Human("Николай", true, 15, new ArrayList<Human>());
        Human father = new Human("Иван", true, 40, new ArrayList<Human>(Arrays.asList(son1, son2, son3)));
        Human mother = new Human("Ирина", false, 40, new ArrayList<Human>(Arrays.asList(son1, son2, son3)));
        Human grandfather1 = new Human("Василий", true, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandfather2 = new Human("Виталий", true, 84, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother1 = new Human("Марфа", false, 70, new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother2 = new Human("Мария", false, 75, new ArrayList<Human>(Arrays.asList(mother)));

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
