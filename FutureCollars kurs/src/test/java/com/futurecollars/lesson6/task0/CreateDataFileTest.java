package com.futurecollars.lesson6.task0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateDataFileTest {
    @Test
    public void shouldCreateTestFile() throws IOException {
        // Given
        String testFilePath = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\src\\test\\java\\com\\futurecollars\\lesson6\\task0\\dataTest.txt";
        String content = "dataTest";

        // When
        CreateDataFile.writeToFile(testFilePath, content);

        // Then
        Assertions.assertTrue(Files.exists(Paths.get(testFilePath)));
        Files.delete(Paths.get(testFilePath));
    }
}
