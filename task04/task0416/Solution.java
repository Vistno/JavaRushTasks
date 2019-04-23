package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        double t = Double.valueOf(s);
        //double u = t * 60.0;
        //int m = (int)u;
        //int r = 0;

        //System.out.println(m);
        double mod = 0;

        if (((mod = t % 5) >= 0) & ((mod = t % 5) < 3))
            System.out.println("зеленый");
        else
            if (((mod = t % 5) >= 3) & ((mod = t % 5) < 4))
                System.out.println("желтый");
            else
                System.out.println("красный");


        /*for (int i = 0; i < 12; i++) {
            if ((m >= (r + 0)) & (m < (r + 180)))
                System.out.println("зеленый");
            else
                if ((m >= (r + 180)) & (m < (r + 240)))
                    System.out.println("желтый");
            else
                if ((m >= (r + 240)) & (m < (r + 300)))
                    System.out.println("красный");
            r = r +300;
        }
        */
        /*if (((m >= 0) & (m < 180)) | ((m >= 300) & (m < 480)) | ((m >= 600) & (m < 780)) | ((m >= 900) & (m < 1080)) | ((m >= 1200) & (m < 1380)) | ((m >= 1500) & (m < 1680)) | ((m >= 1800) & (m < 1980)) | ((m >= 2100) & (m < 2280)) | ((m >= 2400) & (m < 2580)) | ((m >= 2700) & (m < 2880)) | ((m >= 3000) & (m < 3180)) | ((m >= 3300) & (m < 3480)))
            System.out.println("зелёный");
        else
            if (((m >= 180) & (m < 240)) | ((m >= 480) & (m < 540)) | ((m >= 780) & (m < 840)) | ((m >= 1080) & (m < 1140)) | ((m >= 1380) & (m < 1440)) | ((m >= 1680) & (m < 1740)) | ((m >= 1980) & (m < 2040)) | ((m >= 2280) & (m < 2340)) | ((m >= 2580) & (m < 2640)) | ((m >= 2880) & (m < 2940)) | ((m >= 3180) & (m < 3240)) | ((m >= 3480) & (m < 3540)))
                System.out.println("жёлтый");
            else
                System.out.println("красный");
*/
        //напишите тут ваш код
    }
}