package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(s));

        while (true) {
            String t = reader.readLine();
            writer.write(t);
            writer.newLine();
            if (t.equals("exit"))
                break;
        }
        writer.close();
        // напишите тут ваш код
    }
}
