package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }

        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < 10; i++) {
            small1[i] = big[i];
            small2[i] = big[i + 10];
            System.out.println(small2[i]);
        }

        //напишите тут ваш код
    }
}
