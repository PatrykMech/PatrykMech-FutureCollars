package com.futurecollars.lesson10.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    public List<String> findIntegers(List<String> valueList) {
        List<String> integers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        for (String value : valueList) {
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                if (!value.contains(".")) {
                    integers.add(matcher.group());
                }
            }
        }
        return integers;
    }

    public List<String> findFloats(List<String> valueList) {
        List<String> floats = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        for (String value : valueList) {
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                if (!value.contains("e") && !value.contains("E")) {
                    floats.add(matcher.group());
                }
            }
        }
        return floats;
    }

    public List<String> findScientificNotationNumbers(List<String> valueList) {
        List<String> scientificNotationNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+\\.\\d+[eE][-+]?\\d+");
        for (String value : valueList) {
            Matcher matcher = pattern.matcher(value);
            while (matcher.find()) {
                scientificNotationNumbers.add(matcher.group());
            }
        }
        return scientificNotationNumbers;
    }
}