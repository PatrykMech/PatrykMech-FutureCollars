package com.futurecollars.lesson6.task7;

import java.util.Scanner;

public class SquareRootCalculator {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Wrong input");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide number: ");

        try {
            double number = scanner.nextDouble();
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root is " + squareRoot);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}