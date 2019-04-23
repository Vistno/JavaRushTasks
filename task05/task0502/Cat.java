package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));


        if (this.weight + this.strength + this.age > anotherCat.weight + anotherCat.strength + anotherCat.age)
            return true;
        else
            //if (anotherCat.weight + anotherCat.strength + anotherCat.age<this.weight + this.strength + this.age)
            //    return true;
            //else
                return false;

        //напишите тут ваш код
    }

    public static void main(String[] args) {
/*        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 1;
        cat2.age = 2;

        cat1.weight = 10;
        cat2.weight = 20;

        cat1.strength = 100;
        cat2.strength = 200;

        fight (cat1, cat2);
        */
    }
}
