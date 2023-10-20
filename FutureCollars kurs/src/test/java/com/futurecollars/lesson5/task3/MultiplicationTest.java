package com.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void shouldExecuteMultiplyPositiveNumbers() {
        // Given
        Multiplication multiplication = new Multiplication();
        int number1 = 8;
        int number2 = 3;

        // When
        double result = multiplication.execute(number1, number2);

        // Then
        Assertions.assertEquals(24.0, result);
    }

    @Test
    public void shouldExecuteMultiplyNegativeNumbers() {
        // Given
        Multiplication multiplication = new Multiplication();
        int number1 = -8;
        int number2 = -3;

        // When
        double result = multiplication.execute(number1, number2);

        // Then
        Assertions.assertEquals(24.0, result);
    }
}
