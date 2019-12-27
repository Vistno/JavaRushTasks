package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
private FileInputStream fis;
    public TxtInputStream(String fileName) throws FileNotFoundException, IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
            fis = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();

        }

    }

    public static void main(String[] args) {
    }
}

