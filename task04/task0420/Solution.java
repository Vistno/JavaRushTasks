package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String u = reader.readLine();

        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        int c = Integer.parseInt(u);

        if ((a <= b) & (b <= c) & (a <= c))
            System.out.println(c + " " + b + " " + a);
        else
            if ((a >= b) & (b >= c) & (a >= c))
               System.out.println(a + " " + b + " " + c);
            else
                if ((a >= b) & (a >= c) & (b <= c))
                    System.out.println(a + " " + c + " " + b);
                else
                    if ((a >= b) & (a <= c))
                        System.out.println(c + " " + a + " " + b);
                    else
                            if ((a <= b) & (a <= c) & (b >= c))
                                System.out.println(b + " " + c + " " + a);
                            else
                                if ((a <= b) & (a >= c) & (b >= c))
                                    System.out.println(b + " " + a + " " + c);
    }
}
