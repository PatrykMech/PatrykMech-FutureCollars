package com.futurecollars.lesson3.task4;

public class MinuteConverter {
    public static String convertMinutesToSeconds(int minutes) {
        if (minutes < 0) {
            return "Minutes can't be negative";
        } else {
            int seconds = minutes * 60;
            return String.valueOf(seconds);
        }
    }

    public static void main(String[] args) {
        int minutes = 6;
        String seconds = convertMinutesToSeconds(minutes);
        System.out.println(seconds);
    }
}
