package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int j = 0;
        //String temp = "";
        //for (int j = 0; j < 13; j++) {

        do {
        //for (int i = 0; i < 5; i++) {
            String temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, temp);
            j = j + 1;
        } while (j < 13);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
