package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Барсик", new Cat("Барсик"));
        map.put("Иван", new Cat("Иван"));
        map.put("Борис", new Cat("Борис"));
        map.put("Жужик", new Cat("Жужик"));
        map.put("Пупсик", new Cat("Пупсик"));
        map.put("Пушок", new Cat("Пушок"));
        map.put("Лентяй", new Cat("Лентяй"));
        map.put("Жердяй", new Cat("Жердяй"));
        map.put("Жирный", new Cat("Жирный"));
        map.put("Котище", new Cat("Котище"));
        return  map;


        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        set.addAll(map.values());
        return set;

        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
