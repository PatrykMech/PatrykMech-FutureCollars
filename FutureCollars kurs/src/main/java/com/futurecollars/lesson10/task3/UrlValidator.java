package com.futurecollars.lesson10.task3;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    private static final String URL_REGEX = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}$";

    public static boolean validateUrl(String url) {
        Optional<String> optionalUrl = Optional.ofNullable(url);

        return optionalUrl.map(u -> {
            Pattern pattern = Pattern.compile(URL_REGEX);
            Matcher matcher = pattern.matcher(u);
            return matcher.matches();
        }).orElse(false);
    }
}