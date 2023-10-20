package com.futurecollars.lesson6.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootCalculatorTest {
    @Test
    public void shouldCalculateSquareRootForPositiveNumber() {
        // given
        double number = 16.0;

        // when
        double result = SquareRootCalculator.calculateSquareRoot(number);

        // then
        Assertions.assertEquals(4.0, result);
    }

    @Test
    public void shouldCalculateSquareRootForZero() {
        // given
        double number = 0.0;

        // when
        double result = SquareRootCalculator.calculateSquareRoot(number);

        // then
        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void shouldCalculateSquareRootForNegativeNumber() {
        // given
        double number = -1.0;

        // when and then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SquareRootCalculator.calculateSquareRoot(number);
        });
    }
}