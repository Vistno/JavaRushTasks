package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//       FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        List array = new ArrayList();
        while (reader1.ready()) {
//                while (fileInputStream.available() > 0) {
            array.add(Integer.parseInt(reader1.readLine()));
        }

        reader.close();
        reader1.close();
//        fileInputStream.close();

        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            if (((int)array.get(i) % 2) == 0)
                System.out.println(array.get(i));
        }

        // напишите тут ваш код
    }
}
