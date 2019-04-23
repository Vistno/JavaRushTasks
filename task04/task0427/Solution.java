package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ss = Integer.parseInt(s);

        if (((ss >= 1) & (ss <= 999)) & (ss % 2 == 0) & (ss % 10 == ss))
            System.out.println("четное однозначное число");
        else
            if (((ss >= 1) & (ss <= 999)) & (ss % 2 == 0) & (ss % 100 == ss))
                System.out.println("четное двузначное число");
            else
                if (((ss >= 1) & (ss <= 999)) & (ss % 2 == 0) & (ss % 1000 == ss))
                    System.out.println("четное трехзначное число");
                else
                    if (((ss >= 1) & (ss <= 999)) & (ss % 2 != 0) & (ss % 10 == ss))
                        System.out.println("нечетное однозначное число");
                    else
                        if (((ss >= 1) & (ss <= 999)) & (ss % 2 != 0) & (ss % 100 == ss))
                            System.out.println("нечетное двузначное число");
                        else
                            if (((ss >= 1) & (ss <= 999)) & (ss % 2 != 0) & (ss % 1000 == ss))
                                System.out.println("нечетное трехзначное число");

        //напишите тут ваш код

    }
}
