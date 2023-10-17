package com.futurecollars.lesson6.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordSearchInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt";
        String searchWord = "Java";

        try {
            String content = Files.readString(Paths.get(filePath));

            if (content.contains(searchWord)) {
                System.out.println(searchWord + " is in file");
            } else {
                System.out.println(searchWord + " is not in file");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}