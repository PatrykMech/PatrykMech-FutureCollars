package com.futurecollars.lesson2.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues() {

        int number1 = 6;
        int number2 = 3;

        int result = Calculator.add(number1, number2);

        Assertions.assertEquals(9, result);
    }

    @Test
    void shouldSubtractTwoValues(){

        int number1 = 4;
        int number2 = 1;

        int result = Calculator.subtract(number1, number2);

        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldMultiplyTwoValues(){

        int number1 = 5;
        int number2 = 2;

        int result = Calculator.multiply(number1, number2);

        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldDivideTwoValues(){

        int number1 = 5;
        int number2 = 2;

        double result = Calculator.divide(number1, number2);

        Assertions.assertEquals(2.5, result);
    }
}
