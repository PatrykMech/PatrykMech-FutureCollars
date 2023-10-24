package com.futurecollars.lesson7.task3;

import java.util.Scanner;

public class TextLengthGetter {
    public static int calculateTextLength(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to calculate a text length: ");
        String inputText = scanner.nextLine();
        int textLength = calculateTextLength(inputText);
        System.out.println("Text length: " + textLength);
    }
}
