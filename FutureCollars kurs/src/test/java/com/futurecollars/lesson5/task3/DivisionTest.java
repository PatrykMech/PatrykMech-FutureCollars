package com.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void shouldExecuteDivisionPositiveNumbers() {
        // Given
        Division division = new Division();
        int number1 = 8;
        int number2 = 3;

        // When
        double result = division.execute(number1, number2);

        // Then
        Assertions.assertEquals(2.6666666666666665, result);
    }

    @Test
    public void shouldExecuteDivisionNegativeNumbers() {
        // Given
        Division division = new Division();
        int number1 = -8;
        int number2 = -3;

        // When
        double result = division.execute(number1, number2);

        // Then
        Assertions.assertEquals(2.6666666666666665, result);
    }

    @Test
    public void shouldExecuteDivisionByZero() {
        // Given
        Division division = new Division();
        int number1 = 8;
        int number2 = 0;

        //Then
        Assertions.assertThrows(ArithmeticException.class, () -> {
            division.execute(number1, number2);
        });
    }
}