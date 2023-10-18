package com.futurecollars.lesson6.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UpperCaseFileChanger {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\data.txt";
        String outputFilePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\output.txt";
        String content = Files.readString(Paths.get(inputFilePath));
        String upperCaseContent = content.toUpperCase();

        writeToOutputFile(outputFilePath, upperCaseContent);
    }

    public static void writeToOutputFile(String outputFilePath, String upperCaseContent) {
        try {
            Files.writeString(Paths.get(outputFilePath), upperCaseContent);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}