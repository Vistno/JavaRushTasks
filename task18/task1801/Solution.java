package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);

        int result = fileReader.read();
        int calc;

        while (fileReader.available() > 0) {
           if ((calc = fileReader.read()) > result)
               result = calc;
        }

        System.out.println(result);

        fileReader.close();
    }
}
