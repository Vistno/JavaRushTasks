package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();

        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);

        if (ss > tt)
            System.out.println(tt);
        else
            //if (ss < tt)
                System.out.println(ss);
            //else
            //    System.out.println(ss);
            //напишите тут ваш код
    }
}