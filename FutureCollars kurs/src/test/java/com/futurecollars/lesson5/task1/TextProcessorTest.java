package com.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextProcessorTest {

    @Test
    public void shouldProcessPalindrome() {
        // Given
        String text = "level";
        String expectedOutput = "Palindrome: true\nText length: 5";

        // When
        String result = TextProcessor.processText(text);

        // Then
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldProcessNotPalindrome() {
        // Given
        String text = "river";
        String expectedOutput = "Palindrome: false\nText length: 5";

        // When
        String result = TextProcessor.processText(text);

        // Then
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldProcessEmptyText() {
        // Given
        String text = "";
        String expectedOutput = "Text is empty";

        // When
        String result = TextProcessor.processText(text);

        // Then
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldBePalindrome() {
        // Given
        String text = "level";

        // When
        boolean result = TextProcessor.isPalindrome(text);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePalindrome() {
        // Given
        String text = "river";

        // When
        boolean result = TextProcessor.isPalindrome(text);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldGetTextLength() {
        // Given
        String text = "level";

        // When
        int result = TextProcessor.getTextLength(text);

        // Then
        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldTextNotBeEmpty() {
        // Given
        String text = "level";

        // When
        boolean result = TextProcessor.containsCharacters(text);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldTextBeEmpty() {
        // Given
        String text = "";

        // When
        boolean result = TextProcessor.containsCharacters(text);

        // Then
        Assertions.assertTrue(result);
    }
}