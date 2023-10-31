package com.futurecollars.lesson10.task2;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    private static final String PESEL_REGEX = "^[0-9]{11}$";

    public static boolean validatePesel(String pesel) {
        Optional<String> optionalPesel = Optional.ofNullable(pesel);

        return optionalPesel.map(p -> {
            Pattern pattern = Pattern.compile(PESEL_REGEX);
            Matcher matcher = pattern.matcher(p);
            return matcher.matches();
        }).orElse(false);
    }
}