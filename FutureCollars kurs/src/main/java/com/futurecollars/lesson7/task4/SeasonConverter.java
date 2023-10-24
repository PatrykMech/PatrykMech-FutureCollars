package com.futurecollars.lesson7.task4;

import java.time.Month;

public class SeasonConverter {
    public enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }

    public static Season getSeason(Month month) {
        return switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
            case MARCH, APRIL, MAY -> Season.SPRING;
            case JUNE, JULY, AUGUST -> Season.SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
        };
    }
}
