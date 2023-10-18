package com.futurecollars.lesson6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReverseReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt";

        try {
            String content = (Files.readString(Paths.get(filePath)));
            String[] lines = content.split("\n");

            for (int i = lines.length - 1; i >= 0; i--) {
                System.out.println(lines[i]);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

