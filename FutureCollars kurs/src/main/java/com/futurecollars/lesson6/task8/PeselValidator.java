package com.futurecollars.lesson6.task8;

import java.util.Scanner;

public class PeselValidator {
    public static void validatePesel(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (pesel.length() != 11) {
            throw new IllegalLengthException("Wrong length of PESEL: " + pesel);
        }

        if (!pesel.matches("\\d{11}")) {
            throw new WrongTypeOfDataException("Wrong type of PESEL: " + pesel);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PESEL: ");
        String pesel = scanner.nextLine();
        try {
            validatePesel(pesel);
        } catch (WrongTypeOfDataException | IllegalLengthException ex) {
            System.err.println(ex.getMessage());
        }
    }
}