package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] strToArray = s.toCharArray();

//        System.out.println(strToArray);

        for (int i = 1; i < strToArray.length - 1; i++) {
            strToArray[0] = Character.toUpperCase(strToArray[0]);
            if(Character.toString(strToArray[i - 1]).equals(" "))
               strToArray[i] = Character.toUpperCase(strToArray[i]);
        }
        System.out.println(strToArray);



        //напишите тут ваш код
    }
}
