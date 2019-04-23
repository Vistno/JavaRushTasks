package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                String s = list.get(j);
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == alphabet.get(i))
                        count += 1;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }


        // напишите тут ваш код
    }

}
