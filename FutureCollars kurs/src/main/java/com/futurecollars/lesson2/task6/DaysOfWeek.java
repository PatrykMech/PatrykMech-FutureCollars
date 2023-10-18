package com.futurecollars.lesson2.task6;

public class DaysOfWeek {
    public static String whatDayOfWeek(int dayNumber){
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7:
                dayName = "Weekend";
                break;
            default:
                dayName = "There is no such a day!";
        }
        return dayName;
    }
}
