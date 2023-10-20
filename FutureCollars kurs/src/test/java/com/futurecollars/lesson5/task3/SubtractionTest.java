package com.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    @Test
    public void shouldExecuteSubtractPositiveNumbers() {
        // Given
        Subtraction subtraction = new Subtraction();
        int number1 = 8;
        int number2 = 3;

        // When
        double result = subtraction.execute(number1, number2);

        // Then
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void shouldExecuteSubtractNegativeNumbers() {
        // Given
        Subtraction subtraction = new Subtraction();
        int number1 = -8;
        int number2 = -3;

        // When
        double result = subtraction.execute(number1, number2);

        // Then
        Assertions.assertEquals(-5.0, result);
    }
}