package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ss = Integer.parseInt(s);
        //double mod = 0;

        if (ss == 0)
            System.out.println("ноль");
        else
            if ((ss < 0) & (ss % 2 == 0))
                System.out.println("отрицательное четное число");
            else
                if ((ss < 0) & (ss % 2 != 0))
                    System.out.println("отрицательное нечетное число");
                else
                    if ((ss > 0) & (ss % 2 == 0))
                        System.out.println("положительное четное число");
                    else
                        System.out.println("положительное нечетное число");


        //напишите тут ваш код
    }
}
