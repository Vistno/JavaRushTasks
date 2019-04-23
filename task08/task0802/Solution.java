package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> garden = new HashMap<String, String>();
        garden.put("арбуз", "ягода");
        garden.put("банан", "трава");
        garden.put("вишня", "ягода");
        garden.put("груша", "фрукт");
        garden.put("дыня", "овощ");
        garden.put("ежевика", "куст");
        garden.put("жень-шень", "корень");
        garden.put("земляника", "ягода");
        garden.put("ирис", "цветок");
        garden.put("картофель", "клубень");
        for (Map.Entry<String, String> x : garden.entrySet()){
            String key = x.getKey();
            String value = x.getValue();
            System.out.println(key + " - " + value);
        }

        //напишите тут ваш код

    }
}
