package com.futurecollars.lesson10.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void shouldValidPassword() {
        // given
        String validPassword = "Password1";

        // when
        boolean result = PasswordValidator.isPasswordValid(validPassword);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotValidatePassword() {
        // given
        String shortPassword = "password";

        // when
        boolean result = PasswordValidator.isPasswordValid(shortPassword);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldNotValidatePasswordWithSpecialCharacter() {
        // given
        String passwordWithoutUppercase = "Password!";

        // when
        boolean result = PasswordValidator.isPasswordValid(passwordWithoutUppercase);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldNotValidatePasswordWithUpperCaseLetterWithoutDigit() {
        // given
        String passwordWithoutDigit = "Password";

        // when
        boolean result = PasswordValidator.isPasswordValid(passwordWithoutDigit);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldNotValidatePasswordWithCurrentYear() {
        // given
        String passwordWithCurrentYear = "Password2023";

        // when
        boolean result = PasswordValidator.isPasswordValid(passwordWithCurrentYear);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldNotValidatePasswordWithCurrentYearLastTwoDigits() {
        // given
        String passwordWithYearLastTwoDigits = "Password23";

        // when
        boolean result = PasswordValidator.isPasswordValid(passwordWithYearLastTwoDigits);

        // then
        Assertions.assertFalse(result);
    }
}