package com.futurecollars.lesson10.task5;

import java.time.Year;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isPasswordValid(String password) {
        Optional<String> optionalPassword = Optional.ofNullable(password);

        if (optionalPassword.isEmpty() || password.length() <= 7) {
            return false;
        }

        Pattern uppercaseLetterPattern = Pattern.compile("[A-Z]");
        Matcher uppercaseLetterMatcher = uppercaseLetterPattern.matcher(password);
        if (!uppercaseLetterMatcher.find()) {
            return false;
        }

        Pattern digitPattern = Pattern.compile("[0-9]");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        int currentYear = Year.now().getValue();
        return !password.contains(String.valueOf(currentYear)) && !password.contains(String.valueOf(currentYear % 100));
    }
}
