package com.futurecollars.lesson2.task6;

public class DaysOfWeek {
    public static String whatDayOfWeek(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            return dayName(dayNumber);
        } else {
            return "There is no such a day!";
        }
    }

    public static String dayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "";
        }
    }
}
