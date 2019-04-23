package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Козлов", df.parse("JULY 1 1980"));
        map.put("Петров", df.parse("JANUARY 1 1980"));
        map.put("Иванов", df.parse("MAY 1 1980"));
        map.put("Сидоров", df.parse("DECEMBER 1 1980"));
        map.put("Горлодеров", df.parse("AUGUST 1 1980"));
        map.put("Заносский", df.parse("SEPTEMBER 1 1980"));
        map.put("Ибупрофенов", df.parse("OCTOBER 1 1980"));
        map.put("Аленький", df.parse("JULY 1 1980"));
        map.put("Жердяев", df.parse("MARCH 1 1980"));
//        System.out.println(map.size());
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Date m = it.next().getValue();
            if (m.toString().contains("Jun") || m.toString().contains("Jul") || m.toString().contains("Aug"))
                it.remove();

        /*for (Map.Entry<String, Date> entry : map.entrySet()) {
//            System.out.println(entry.getValue().getMonth());
            if ((entry.getValue().toString().contains("Jun")) || (entry.getValue().toString().contains("Jul")) || (entry.getValue().toString().contains("Aug"))) {
                map.remove(entry);
            }*/
        //напишите тут ваш код
    }
//        System.out.println(map.size());
    }

    public static void main(String[] args) {
 //       System.out.println(map.size());
    }
}
