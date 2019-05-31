package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String str = "?";
        try {
            String url = reader.readLine();
            //удаляем начало URL
            url = url.substring(url.indexOf("?") + 1, url.length());
            //ищем и выводим параметры
            for (String param : url.split("&")) {
                try {
                    System.out.print(param.substring(0, param.indexOf("=")) + " ");
                }
                catch (Exception e) {
                    System.out.print(param + " ");
                }
            }
            //находим и выводим double
            System.out.print("\n");
            if (url.contains("obj")) {
                String exit = url.substring(url.indexOf("obj") + 4, url.indexOf("&"));
                try {
                    alert(Double.parseDouble(exit));
                }
                catch (Exception e) {
                    alert(exit);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
