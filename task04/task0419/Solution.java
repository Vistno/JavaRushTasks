package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        String u = reader.readLine();
        String v = reader.readLine();

        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);
        int uu = Integer.parseInt(u);
        int vv = Integer.parseInt(v);
        int xx = 0, yy = 0, zz = 0;

        if (ss > tt)
            xx = ss;
        else
            xx = tt;

        if (uu > vv)
            yy = uu;
        else
            yy = vv;

        if (xx > yy)
            zz = xx;
        else
            zz = yy;

        System.out.println(zz);

        //напишите тут ваш код
    }
}
