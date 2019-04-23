package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] line = new int[20];
        for (int i = 0; i < 20; i++) {
            line[i] = Integer.parseInt(reader.readLine());
        }
        maximum = line[0];
        for (int i = 0; i < line.length; i++) {
            if (line[i] > maximum)
                maximum = line[i];
        }
        minimum = line [0];
        for (int i = 0; i < line.length; i++) {
            if (line[i] < minimum)
                minimum = line[i];
        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
