package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine();

        int t = Integer.parseInt(s);

        if (t == 1)
            System.out.println("понедельник");
        else
            if (t == 2)
                System.out.println("вторник");
            else
                if (t == 3)
                    System.out.println("среда");
                else
                    if (t == 4)
                        System.out.println("четверг");
                    else
                        if (t == 5)
                            System.out.println("пятница");
                        else
                            if (t == 6)
                                System.out.println("суббота");
                            else
                                if (t == 7)
                                    System.out.println("воскресенье");
                                else
                                    System.out.println("такого дня недели не существует");

        //напишите тут ваш код
    }
}