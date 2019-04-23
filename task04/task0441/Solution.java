package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(reader.readLine());
        int t = Integer.parseInt(reader.readLine());
        int u = Integer.parseInt(reader.readLine());

        if (((s < t) & (t < u)) | ((u < t) & (t < s)) | ((s == t) | (t == u)))
            System.out.println(t);
        else
            if (((s < u) & (u < t)) | ((t < u) & (u < s)) | ((s == u) | (t == u)))
                System.out.println(u);
            else
                if (((t < s) & (s < u)) | ((u < s) & (s < t)) | ((s == t) | (s == u)))
                    System.out.println(s);
                else
                    System.out.println(s);






        //напишите тут ваш код
    }
}
