package com.futurecollars.lesson6.task7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRootCalculator {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Please provide a non-negative number");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        try {
            double number = scanner.nextDouble();
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root is " + squareRoot);
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid number");
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}