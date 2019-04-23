package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int t = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")){
                System.out.println(t);
                break;
            }
            else
                t += Integer.parseInt(s);
        }


        //напишите тут ваш код
    }
}
