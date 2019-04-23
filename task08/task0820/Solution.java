package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet pets = new HashSet();
        pets.addAll(cats);
        pets.addAll(dogs);

        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()) {
            Object temp = iterator.next();
            for (Cat cat : cats)
                if ( temp == cat)
                    iterator.remove();
        }

        /*        for (Object pet : pets)
            for (Cat cat : cats)
                if (pet == cat)
                    pets.remove(pet);*/

        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets)
            System.out.println(pet);

        //напишите тут ваш код
    }

    public static class Cat {

    }

    public static class Dog {

    }

    //напишите тут ваш код
}
