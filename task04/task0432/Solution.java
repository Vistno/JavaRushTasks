package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        int tt = Integer.parseInt(t);

        while (tt > 0) {
            System.out.println(s);
            tt--;
        }

        //напишите тут ваш код

    }
}
