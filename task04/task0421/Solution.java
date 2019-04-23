package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();

        if (s.equals(t))
            System.out.println("Имена идентичны");
        else
            if (s.length() == t.length())
                System.out.println("Длины имен равны");
        //напишите тут ваш код
    }
}
