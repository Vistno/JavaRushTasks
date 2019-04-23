package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringLists = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            arrayOfStringLists[i] = new ArrayList<>();
            arrayOfStringLists[i].add(Double.toString(Math.random()));
        }



        //напишите тут ваш код

        return arrayOfStringLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}