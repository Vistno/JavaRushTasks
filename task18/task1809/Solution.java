package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // считываем имена файлов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();


        //считываем содержимое первого файла в буфер
        FileInputStream fileReader1 = new FileInputStream(file1);
        byte[] buffer = new byte[fileReader1.available()];
        fileReader1.read(buffer);

        //начинаем запись
        FileOutputStream outputStream = new FileOutputStream(file2);
        for (int i = buffer.length - 1; i >= 0 ; i--) {
            outputStream.write(buffer[i]);
        }

        //закрываем стримы
        fileReader1.close();
        outputStream.close();
    }
}
