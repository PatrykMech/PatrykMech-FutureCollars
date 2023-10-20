package com.futurecollars.lesson5.task1;


public class TextProcessor {

    public static String processText(String text) {
        boolean isPalindrome = isPalindrome(text);
        int textLength = getTextLength(text);

        if (containsCharacters(text)) {
            return "Text is empty";
        } else {
            return "Palindrome: " + isPalindrome + "\nText length: " + textLength;
        }
    }

    protected static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

    protected static int getTextLength(String text) {
        return text.length();
    }

    protected static boolean containsCharacters(String text) {
        return text.isEmpty();
    }
}