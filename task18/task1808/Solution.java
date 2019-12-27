package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // считываем имена файлов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        //считываем содержимое первого файла в буфер
        FileInputStream fileReader1 = new FileInputStream(file1);
        byte[] buffer = new byte[fileReader1.available()];
        int count = fileReader1.read(buffer);

        //считаем какую часть первого файла будем записывать во второй
        int part = 0;
        if (count%2 > 0)
            part = (count / 2) + 1;
        else
            part = count / 2;

/*        // считаем длину содержимого второго и третьего файлов
        FileInputStream fileReader2 = new FileInputStream(file2);
        int count2 = fileReader2.available();

        FileInputStream fileReader3 = new FileInputStream(file3);
        int count3 = fileReader3.available(); */

        //начинаем запись
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        outputStream2.write(buffer, 0, part);

        FileOutputStream outputStream3 = new FileOutputStream(file3);
        outputStream3.write(buffer, part, buffer.length - part);

        //закрываем стримы
        fileReader1.close();
//       fileReader2.close();
//        fileReader3.close();
        outputStream2.close();
        outputStream3.close();

    }
}
