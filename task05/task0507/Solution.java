package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int value = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                System.out.println((double) value / count);
                break;
            } else {
                count = count + 1;
                value = value + a;
            }

            //напишите тут ваш код
        }
    }
}

