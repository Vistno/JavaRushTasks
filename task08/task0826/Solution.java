package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
            for (int j = array.length - 1, i = 0; j > i; j--, i++) {
                int tmp;
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
        }

        /*        int temp = 0; // пузырьковую сортировку не принимает валидатор
        for (int i = array.length - 1; i > 1 ; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }*/

/*        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
    }
}
