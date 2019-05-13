package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
        InputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            System.out.print((char)data);
        }
        inputStream.close();
        reader.close();

        // напишите тут ваш код
    }
}