package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat ("Tom", 5, "California");
        Dog gavDog = new Dog("Bill", "Bull", 32);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int age;
        String address;

        public Cat (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Dog {
        String name;
        String poroda;
        int tooth;

        public Dog (String name, String poroda, int tooth) {
            this.name = name;
            this.poroda = poroda;
            this.tooth = tooth;
        }
    }//напишите тут ваш код
}
