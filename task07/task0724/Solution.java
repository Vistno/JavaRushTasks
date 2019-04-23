package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Иван", true, 85);
        Human grandfather2 = new Human("Павел", true, 87);
        Human grandmother1 = new Human("Мария", false, 82);
        Human grandmother2 = new Human("Ирина", false, 84);
        Human father1 = new Human("Петр", true, 55, grandfather1, grandmother1);
        Human mother1 = new Human("Ольга", false, 50, grandfather2, grandmother2);
        Human son1 = new Human("Олег", true, 25, father1, mother1);
        Human son2 = new Human("Борис", true, 22, father1, mother1);
        Human daughter = new Human("Инна", false, 16, father1, mother1);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());


        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}