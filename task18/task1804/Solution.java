package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        while (fileReader.available() > 0) {
            int data = fileReader.read();
            if (hashMap.containsKey(data))
                hashMap.replace(data, hashMap.get(data)+1);
            else
                hashMap.put(data, 1);
        }

        int m = 1;
        for (Integer b: hashMap.values()) {
            if (b < m)
                m = b;
        }

        for (Map.Entry<Integer, Integer> b: hashMap.entrySet()) {
            if (b.getValue() == m)
                System.out.print(b.getKey() + " ");
        }

        fileReader.close();

    }
}

