package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
//            int id;
            String id = reader.readLine();

            if (id.isEmpty())
                break;
//            else
            String name = reader.readLine();
            if (name.isEmpty()) {
                map.put(name, Integer.parseInt(id));
                break;
            }

        map.put(name, Integer.parseInt(id));
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}