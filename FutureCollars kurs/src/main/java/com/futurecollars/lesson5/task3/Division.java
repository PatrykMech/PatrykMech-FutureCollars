package com.futurecollars.lesson5.task3;

public class Division implements Operation {
    @Override
    public double execute(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException();
        }
        return (double) number1 / number2;
    }
}
