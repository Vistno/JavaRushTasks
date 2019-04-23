package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int t;

        //int f, g, h, i, j;
        for (int i = 0; i < 5; i++) {


        if (a > b){
            t = a;
            a = b;
            b = t;
        }

            if (b > c){
                t = b;
                b = c;
                c = t;
            }

            if (c > d){
                t = c;
                c = d;
                d = t;
            }

            if (d > e){
                t = d;
                d = e;
                e = t;
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //напишите тут ваш код
    }
}
