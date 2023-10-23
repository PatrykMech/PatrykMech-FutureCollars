package com.futurecollars.lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberProcessor {
    public static boolean isEven(int number) {
        return number != 0 && number % 2 == 0;
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Provide an integer: ");
            int number = scanner.nextInt();

            if (isEven(number)) {
                System.out.println("Number " + number + " is divisible by 2");
            } else {
                System.out.println("Number " + number + " is not divisible by 2");
            }

            int digitSum = calculateDigitSum(number);
            System.out.println("Sum of digits in number " + number + " is " + digitSum);
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid integer");
        }
    }
}