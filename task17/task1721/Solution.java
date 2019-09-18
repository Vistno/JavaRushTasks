package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String name1 = "", name2 = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            name1 = reader.readLine();
            name2 = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(name1)));
            while (fileReader.ready()) {
                allLines.add(fileReader.readLine());
            }
            fileReader.close();
            BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(name2)));
            while (fileReader1.ready()) {
                forRemoveLines.add(fileReader1.readLine());
            }
            fileReader1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
