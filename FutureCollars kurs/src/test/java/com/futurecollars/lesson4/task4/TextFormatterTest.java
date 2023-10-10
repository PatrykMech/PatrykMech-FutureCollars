package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFormatterTest {

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

    @Test
    void shouldGiveNothing() {
        // Given
        TextFormatter formatter = new UppercaseFormatter();
        String text = "";

        // When
        String formattedText = formatter.formatText(text);

        // Then
        Assertions.assertEquals("", formattedText);
    }
}
