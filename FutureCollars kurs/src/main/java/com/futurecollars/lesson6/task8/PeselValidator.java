package com.futurecollars.lesson6.task8;

import java.util.Scanner;

public class PeselValidator {
    public static void validatePesel(String pesel) {
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Wrong length of PESEL");
        }

        if (!pesel.matches("\\d{11}")) {
            throw new IllegalArgumentException("Wrong type");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PESEL: ");
        String pesel = scanner.nextLine();
        try {
            validatePesel(pesel);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}