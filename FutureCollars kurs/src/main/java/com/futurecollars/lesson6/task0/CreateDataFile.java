package com.futurecollars.lesson6.task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateDataFile {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\src\\main\\java\\com\\futurecollars\\lesson6\\task0\\data.txt";
        String content = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku";

        writeToFile(pathToFile, content);
    }

    public static void writeToFile(String pathToFile, String content) {
        try {
            Files.writeString(Paths.get(pathToFile), content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}