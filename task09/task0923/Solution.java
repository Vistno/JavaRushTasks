package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String [] s = reader.readLine().split("");
        char[] array = s.toCharArray();
//        Set<char> glas = new char[];
        String vowel = "";
        String unvowel = "";

        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i]))
                vowel += array[i] + " ";
            else
                if (array[i] != ' ')
                    unvowel += array[i] + " ";
            }
        System.out.println(vowel);
        System.out.println(unvowel);
        }





        //напишите тут ваш код


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}