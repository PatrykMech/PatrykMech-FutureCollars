package com.futurecollars.lesson10.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    private final List<String> valueList = new ArrayList<>();

    public NumberExtractor() {
        valueList.add("342");
        valueList.add("5.34");
        valueList.add("756");
        valueList.add("1.234e+07");
        valueList.add("7.234243E-02");
        valueList.add("6.09");
        valueList.add("3457");
        valueList.add("87");
        valueList.add("1.0001");
        valueList.add("3");
        valueList.add("5");
    }

    public List<String> findIntegers() {
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

    public List<String> findFloats() {
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

    public List<String> findScientificNotationNumbers() {
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