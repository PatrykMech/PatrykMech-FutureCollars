package com.futurecollars.lesson7.task2;

import java.util.Scanner;

public class TextTransformer {
    public static String convertToUppercase(String text) {
        if (text == null) {
            return null;
        }
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text that should be converted to Uppercase: ");
        String inputText = scanner.nextLine();

        String uppercaseText = convertToUppercase(inputText);
        System.out.println(uppercaseText);
    }
}