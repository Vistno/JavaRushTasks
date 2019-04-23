package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int count = 0, countmax = 0, countmin = 0;

        for (int i = 0; i < list.size(); i++) {
            if (count < list.get(i).length()) {
                count = list.get(i).length();
                countmax = i;
            }
        }
        //System.out.println(countmax);

        count = list.get(0).length();
        //System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < count) {
                count = list.get(i).length();
                countmin = i;

            }

        }
        //System.out.println(countmin);

        if (countmax > countmin)
            System.out.println(list.get(countmin));
        else
            System.out.println(list.get(countmax));

        //напишите тут ваш код
    }
}
