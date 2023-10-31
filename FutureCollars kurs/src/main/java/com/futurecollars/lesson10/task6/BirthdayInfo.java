package com.futurecollars.lesson10.task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthdayInfo {

    public static boolean isDateFormatValid(String dateOfBirth) {
        try {
            LocalDate.parse(dateOfBirth);
            return dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}");
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static int calculateAge(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public static DayOfWeek calculateDayOfWeek(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        return birthDate.getDayOfWeek();
    }

    public static int calculateWeekOfYear(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return birthDate.get(weekFields.weekOfWeekBasedYear());
    }
}