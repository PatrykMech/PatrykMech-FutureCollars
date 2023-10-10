package com.futurecollars.lesson3.task4;

public class MinuteConverter {
    static int converter_multiply = 60;
    public static int convertMinutesToSeconds(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes can't be negative");
        } else {
            return minutes * converter_multiply;
        }
    }
}
