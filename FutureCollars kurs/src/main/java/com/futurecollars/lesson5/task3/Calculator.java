package com.futurecollars.lesson5.task3;

public class Calculator {
    private final Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(int number1, int number2) {
        return operation.execute(number1, number2);
    }
}