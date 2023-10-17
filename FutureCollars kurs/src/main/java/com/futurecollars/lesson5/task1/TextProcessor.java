package com.futurecollars.lesson5.task1;


public class TextProcessor {
    public static void main(String[] args) {
        String text = "rotator";
        boolean isPalindrome = PalindromeChecker.isPalindrome(text);
        int textLength = TextLengthCounter.getTextLength(text);

        if (TextVerifier.containsCharacters(text)) {
            System.out.println("Text is empty");
        } else {
            System.out.println("Palindrome: " + isPalindrome);
            System.out.println("Text length: " + textLength);
        }
    }
}