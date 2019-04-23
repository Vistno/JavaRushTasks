package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 1000);
        map.put("Сидоров", 700);
        map.put("Козлов", 300);
        map.put("Печалькин", 600);
        map.put("Радостев", 500);
        map.put("Годнов", 200);
        map.put("Занятый", 100);
        map.put("Открывашкин", 400);
        map.put("Пупсиков", 10000);
        return map;

        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            //String m = it.next().getValue();
            if (it.next().getValue() < 500)
                it.remove();
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {
/*        HashMap<String, Integer> map = createMap();
        System.out.println(map.size());
        removeItemFromMap(map);
        System.out.println(map.size());*/
    }
}