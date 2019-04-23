package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 1;

        while (b < 11) {
        //a = a + b;
            while (a < 11) {
                System.out.print(a * b + " ");
                a++;
            }
            System.out.print("\n");
            b++;
            a = 1;
        }

        //напишите тут ваш код

    }
}
