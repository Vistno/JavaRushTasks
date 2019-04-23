package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        if ((ss <= 0) & (tt <= 0) & (uu <= 0))
            System.out.println("0");
        else
            if ((ss > 0) & (tt > 0) & (uu > 0))
                System.out.println("3");
            else
                if (((ss > 0) & (tt > 0) & (uu <= 0)) | ((ss > 0) & (tt <= 0) & (uu > 0)) | ((ss <= 0) & (tt > 0) & (uu > 0)))
                    System.out.println("2");
                else
                    System.out.println("1");

        //напишите тут ваш код

    }
}
