package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Сергей");
        map.put("Козлов", "Борис");
        map.put("Сидоров", "Иван");
        map.put("Иванов", "Антон");
        map.put("Пеленкин", "Влад");
        map.put("Зенитчиков", "Стоян");
        map.put("Зайцев", "Роман");
        map.put("Перепелица", "Евгений");
        map.put("Чайников", "Иван");
        return map;

        //напишите тут ваш код

        //return null;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
