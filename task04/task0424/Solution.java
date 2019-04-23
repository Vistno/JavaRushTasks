package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (ss == tt)
            System.out.println("3");
        else
            if (tt == uu)
                System.out.println("1");
            else
                if (ss == uu)
                    System.out.println("2");

        //напишите тут ваш код
    }
}
