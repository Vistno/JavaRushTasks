package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < s; i++) {

            for (int j = 0; j < t; j++) {
                System.out.print("8");
            }
            System.out.print("\n");

        }//напишите тут ваш код

    }
}
