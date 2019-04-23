package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        //int minimum = min(a, b);


        System.out.println("Minimum = " + min(a, b, c, d, e));
    }


    public static int min(int a, int b, int c, int d, int e) {
        //int minimum = 0;

        int minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);
        minimum = Math.min(minimum, d);
        minimum = Math.min(minimum, e);
            /*if (a > b)
                    minimum = b;
            else
                if (b > c)
                    minimum = c;
                else
                    if (c > d)
                        minimum = d;
                    else
                        if (d > e)
                            minimum = e;
                        else
                            minimum = d;*/
        return minimum;
    }
}
