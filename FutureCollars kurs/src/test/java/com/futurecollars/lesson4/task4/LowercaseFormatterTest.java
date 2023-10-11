package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LowercaseFormatterTest {
    @Test
    void shouldBeLowercase() {
        // Given
        TextFormatter formatter = new LowercaseFormatter();
        String text = "Hello, World!";

        // When
        String formattedText = formatter.formatText(text);

        // Then
        Assertions.assertEquals("hello, world!", formattedText);
    }
}
