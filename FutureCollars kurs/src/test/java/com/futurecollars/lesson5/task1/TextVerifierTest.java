package com.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextVerifierTest {

    @Test
    public void shouldBeEmptyText() {
        // Given
        String text = "";

        // When
        boolean isEmptyText = TextVerifier.containsCharacters(text);

        // Then
        Assertions.assertTrue(isEmptyText);
    }

    @Test
    public void shouldNotBeEmptyText() {
        // Given
        String text = "kayak";

        // When
        boolean isEmptyText = TextVerifier.containsCharacters(text);

        // Then
        Assertions.assertFalse(isEmptyText);
    }
}
