package com.futurecollars.lesson5.task1;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}