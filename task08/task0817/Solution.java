package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Козлов", "Илья");
        map.put("Иванов", "Иван");
        map.put("Петров", "Илья");
        map.put("Сидоров", "Петр");
        map.put("Игуанов", "Дмитрий");
        map.put("Перчиков", "Илья");
        map.put("Иваницкий", "Сергей");
        map.put("Жлобов", "Илья");
        map.put("Петрусевич", "Виктор");
        map.put("Яхонтов", "Роман");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> entry : copy.entrySet()) {
          String m = entry.getValue();
          for (Map.Entry<String, String> entry1 : copy.entrySet()) {
                if (entry1.getValue().equals(m) && !entry1.equals(entry)) {
  //                  System.out.println(entry1.getValue());
                    removeItemFromMapByValue(map, entry1.getValue());
                }
            }
        }
/*        //HashMap<String, String> copy = new HashMap<>(map);
        Map<String, String> copy = Collections.synchronizedMap(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            removeItemFromMapByValue(copy, pair.getValue());
        }
/*        Iterator<Map.Entry<String, String>> it = copy.entrySet().iterator();
        while (it.hasNext()) {
            String s = it.next().getValue();
            removeItemFromMapByValue(copy, s);
        }*/
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
//        System.out.println(map.size());
    }

    public static void main(String[] args) {
//        HashMap<String, String> hashmap = createMap();
//        System.out.println(hashmap.size());
//        removeTheFirstNameDuplicates(hashmap);
//        System.out.println(hashmap.size());
    }
}
