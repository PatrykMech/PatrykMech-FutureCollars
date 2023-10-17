package com.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void shouldBePalindrome() {
        //Given
        String text = "kayak";
        //When
        boolean isPalindrome = PalindromeChecker.isPalindrome(text);
        //Then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void shouldNotBePalindrome() {
        //Given
        String text = "car";
        //When
        boolean isPalindrome = PalindromeChecker.isPalindrome(text);
        //Then
        Assertions.assertFalse(isPalindrome);
    }
}