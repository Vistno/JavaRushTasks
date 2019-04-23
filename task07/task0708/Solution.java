package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String j = reader.readLine();
            strings.add(j);
        }
        /*ArrayList<String> numbers = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String a = strings.get(i);
            int k = a.length();
            numbers.add(k);
        }*/
        int count = 0, index = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (count < (strings.get(i)).length()) {
                count = strings.get(i).length();
                index = i;
            }
        }

        //System.out.println(strings.get(index));

        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i)).length() == count) {
                System.out.println(strings.get(i));
            }
        }
        //напишите тут ваш код
    }
}
