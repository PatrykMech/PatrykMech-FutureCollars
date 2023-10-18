package com.futurecollars.lesson6.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) {
        try {
            String content = Files.readString(Paths.get("C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt"));
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
