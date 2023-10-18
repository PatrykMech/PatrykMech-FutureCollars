package com.futurecollars.lesson6.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharacterCountInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt";

        try {
            String content = Files.readString(Paths.get(filePath));
            int characterCount = content.length();

            System.out.println("Number of characters in file: " + characterCount);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
