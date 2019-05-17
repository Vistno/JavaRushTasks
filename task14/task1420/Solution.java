package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstint = 0;
        int secondint = 0;

        String first = reader.readLine();
//            firstint = Integer.parseInt(first);
            if ((firstint = Integer.parseInt(first)) <= 0)
                throw new NumberFormatException();
   //     System.out.println(firstint);

        String second = reader.readLine();
//            secondint = Integer.parseInt(second);

        if ((secondint = Integer.parseInt(second)) <= 0)
            throw new NumberFormatException();
 //       System.out.println(secondint);

        while (firstint != 0 && secondint != 0) {
            if (firstint > secondint) {
                firstint %= secondint;
            } else {
                secondint %= firstint;
            }
        }


        System.out.println(firstint + secondint);
        reader.close();

    }
}
