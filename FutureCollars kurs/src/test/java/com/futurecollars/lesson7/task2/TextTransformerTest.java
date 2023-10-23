package com.futurecollars.lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTransformerTest {

    @ParameterizedTest
    @ValueSource(strings = {"patryk", "123abc456DEF/;&gh", "Hello World"})
    void shouldConvertTextToUppercase(String input) {
        // Given When
        String result = TextTransformer.convertToUppercase(input);

        // Then
        Assertions.assertEquals(input.toUpperCase(), result);
    }

    @Test
    void shouldHandleNullInput() {
        // Given
        String input = null;

        // When
        String result = TextTransformer.convertToUppercase(input);

        // Then
        Assertions.assertNull(result);
    }

    @Test
    void shouldHandleEmptyInput() {
        // Given
        String input = "";

        // When
        String result = TextTransformer.convertToUppercase(input);

        // Then
        Assertions.assertEquals("", result);
    }
}
