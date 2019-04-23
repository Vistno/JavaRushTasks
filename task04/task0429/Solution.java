package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String u = reader.readLine();

        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);
        int uu = Integer.parseInt(u);

        int a = 0, b = 0;

            if (ss > 0)
                a += 1;
            else if (ss < 0)
                b += 1;

            if (tt > 0)
                a += 1;
            else if (tt < 0)
                b += 1;

            if (uu > 0)
                a += 1;
            else if (uu < 0)
                b += 1;

            System.out.println("количество отрицательных чисел: " + b);
            System.out.println("количество положительных чисел: " + a);

            //напишите тут ваш код
    }
}
