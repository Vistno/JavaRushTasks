package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int cc = Integer.parseInt(c);

        if (((aa + bb) > cc) & ((bb + cc) > aa) & ((aa + cc) > bb))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
        //напишите тут ваш код
    }
}