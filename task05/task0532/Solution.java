package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N <= 0)
            System.out.println("Чило должно быть больше нуля");
        else {
            int maximum = -2147483648;
            for (int i = 0; i < N; i++) {
                int maxx = Integer.parseInt(reader.readLine());
                maximum = Math.max(maximum, maxx);
            }

            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
