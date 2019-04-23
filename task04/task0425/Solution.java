package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);

        if ((ss > 0) & (tt > 0))
            System.out.println("1");
        else
            if ((ss < 0) & (tt > 0))
                System.out.println("2");
            else
                if ((ss < 0) & (tt < 0))
                    System.out.println("3");
                else
                    if ((ss > 0) & (tt < 0))
                        System.out.println("4");
        //напишите тут ваш код
    }
}
