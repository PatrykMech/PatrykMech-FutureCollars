package com.futurecollars.lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberProcessorTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, -2})
    void shouldReturnTrueForEvenNumbers(int number) {
        // Given When
        boolean result = NumberProcessor.isEven(number);

        // Then (then)
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, -1, 0})
    void shouldReturnFalseForOddNumbersAndZero(int number) {
        // Given When
        boolean result = NumberProcessor.isEven(number);

        // Then
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"123, 6", "456, 15", "7890, 24", "0, 0"})
    void shouldCalculateDigitSum(int number, int expectedSum) {
        // Given When
        int result = NumberProcessor.calculateDigitSum(number);

        // Then
        Assertions.assertEquals(expectedSum, result);
    }
}
