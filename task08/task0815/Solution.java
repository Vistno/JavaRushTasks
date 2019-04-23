package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петорв", "Сергей");
        map.put("Сидоров", "Петр");
        map.put("Козлов", "Олег");
        map.put("Ипатов", "Роберт");
        map.put("Черевичкин", "Виктор");
        map.put("Ленивов", "Андрей");
        map.put("Перепелица", "Алексей");
        map.put("Шумахер", "Иван");
        map.put("Попов", "Петр");
        return map;

        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> temp = (Map.Entry)iterator.next();
            if (temp.getValue().equals(name))
                count = count + 1;
        }
        /*int count = 0;
        for (int i = 1; i < map.size(); i++) {
            if (map.containsValue(name))
                count += count;
        }*/

        return count;

        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry temp = (Map.Entry)iterator.next();
            if (temp.getKey() == lastName)
                count = count + 1;
        }
        /*int count = 0;
        for (int i = 1; i < map.size(); i++) {
            if (map.getValue(lastName))
                count += count;
        }*/
        return count;

        //напишите тут ваш код

    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(),"Петр"));
//        System.out.println(getCountTheSameLastName(createMap(), "Козлов"));


    }
}
