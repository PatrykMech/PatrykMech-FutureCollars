package com.futurecollars.lesson6.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderForSecondLines {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt";
        try {
            String text = Files.readString(Paths.get(filePath));
            String[] lines = text.split("\n");

            for (int i = 0; i < lines.length; i += 2) {
                System.out.println(lines[i]);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
