package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {

//        }
//        while (true) {
            for (int i = array.length - 2; i > -1; i--) {
                int t = array[i];
                if (t < array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
//            }
            }
        }//напишите тут ваш код
    }
}
