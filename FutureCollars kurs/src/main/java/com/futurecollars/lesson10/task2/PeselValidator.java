package com.futurecollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    private static final String PESEL_REGEX = "^[0-9]{11}$";

    public static boolean validatePesel(String pesel) {
        Pattern pattern = Pattern.compile(PESEL_REGEX);
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }
}
