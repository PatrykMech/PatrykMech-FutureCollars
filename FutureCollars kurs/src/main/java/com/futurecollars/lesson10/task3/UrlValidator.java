package com.futurecollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    private static final String URL_REGEX = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}$";

    public static boolean validateUrl(String url) {
        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
