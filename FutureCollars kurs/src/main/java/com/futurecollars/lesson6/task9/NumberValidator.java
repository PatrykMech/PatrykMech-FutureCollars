package com.futurecollars.lesson6.task9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberValidator {
    public void validate(int value) {
        try {
            if (value % 3 != 0) {
                throw new IllegalArgumentException("The number " + value + " is not divisible by 3");
            }
            System.out.println("The number " + value + " is divisible by 3");
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        NumberValidator validator = new NumberValidator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Provide a number: ");
            int value = scanner.nextInt();
            validator.validate(value);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please provide a valid integer.");
        }
    }
}
