package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.function.ToIntFunction;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine();

        int t = Integer.parseInt(s);
        if (t == 0)
            System.out.println(0);
        else
            if (t < 0) {
                t += 1;
                System.out.println(t);
            }
            else {
                t = t * 2;
                System.out.println(t);
            }

        //напишите тут ваш код

    }

}