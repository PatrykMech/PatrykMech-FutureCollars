package com.futurecollars.lesson3.task4;

public class MinuteConverter {
    private static final int SECONDS_IN_A_MINUTE = 60;
    public static int convertMinutesToSeconds(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes can't be negative");
        } else {
            return minutes * SECONDS_IN_A_MINUTE;
        }
    }
}
