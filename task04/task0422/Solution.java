package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();

        int u = Integer.parseInt(t);

        if (u < 18)
            System.out.println("Подрасти еще");
        //напишите тут ваш код
    }
}
