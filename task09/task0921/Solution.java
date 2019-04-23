package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();

        try {
            while (true) {
                //int n = Integer.parseInt(reader.readLine());
                array.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e) {
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }

        }
            //напишите тут ваш код
    }
}
