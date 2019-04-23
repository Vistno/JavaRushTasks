package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if ((ss == tt) & (tt == uu))
            System.out.print(ss + " " + tt + " " + uu);
        else
            if (ss == tt)
                System.out.print(ss + " " + tt);
            else
                if (tt == uu)
                    System.out.println(tt + " " + uu);
                else
                    if (ss == uu)
                        System.out.println(ss + " " + uu);
        //напишите тут ваш код
    }
}