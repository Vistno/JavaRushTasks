package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(2.2, "Один");
        labels.put(2.3, "Два");
        labels.put(2.4, "Три");
        labels.put(2.5, "Четыре");
        labels.put(2.6, "Пять");
    }
}
