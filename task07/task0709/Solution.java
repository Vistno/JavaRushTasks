package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> massiv = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String j = reader.readLine();
            massiv.add(j);
        }
        int count = massiv.get(0).length();
        for (int i = 0; i < massiv.size(); i++) {
            if (massiv.get(i).length() < count)
                count = massiv.get(i).length();
        }
        for (int i = 0; i < massiv.size(); i++) {
            if (massiv.get(i).length() == count)
                System.out.println(massiv.get(i));
        }
        //напишите тут ваш код
    }
}
