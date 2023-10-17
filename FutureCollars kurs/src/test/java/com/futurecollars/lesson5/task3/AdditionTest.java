package com.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void shouldExecuteAddPositiveNumbers() {
        // Given
        Addition addition = new Addition();
        int number1 = 8;
        int number2 = 3;

        // When
        double result = addition.execute(number1, number2);

        // Then
        Assertions.assertEquals(11.0, result);
    }

    @Test
    public void shouldExecuteAddNegativeNumbers() {
        // Given
        Addition addition = new Addition();
        int number1 = -8;
        int number2 = -3;

        // When
        double result = addition.execute(number1, number2);

        // Then
        Assertions.assertEquals(-11.0, result);
    }
}