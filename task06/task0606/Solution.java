package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //int n = Integer.parseInt(s);

        int number = s.length();
        //System.out.println(number);

        for (int i = 0; i < number; i++) {
            //int pow = (int)Math.pow(10.0, (double)i);
            String x = s.substring(i, (i + 1));
            //System.out.println(x);
            if (Integer.parseInt(x)%2 == 0){
                //System.out.println(n%pow);
                even = even + 1;
                //System.out.println(even);
                //System.out.println((n%(int)Math.pow (10, i)) / 2);
            }
            else {
                odd = odd + 1;
                //System.out.println(n%pow);
                //System.out.println(odd);
                //System.out.println((n%(int)Math.pow (10, i)) / 2);
            }

        }

        System.out.println("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}
