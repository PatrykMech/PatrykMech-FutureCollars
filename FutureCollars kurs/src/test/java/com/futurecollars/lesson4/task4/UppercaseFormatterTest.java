package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UppercaseFormatterTest {
    @Test
    void shouldBeUppercase() {
        // Given
        TextFormatter formatter = new UppercaseFormatter();
        String text = "Hello, World!";

        // When
        String formattedText = formatter.formatText(text);

        // Then
        Assertions.assertEquals("HELLO, WORLD!", formattedText);
    }
}
