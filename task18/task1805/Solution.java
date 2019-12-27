package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);

        SortedSet<Integer> set = new TreeSet<>();

        while (fileReader.available() > 0) {
            set.add(fileReader.read());
        }

        for (int s: set) {
            System.out.print(s + " ");
        }

        fileReader.close();
    }
}
