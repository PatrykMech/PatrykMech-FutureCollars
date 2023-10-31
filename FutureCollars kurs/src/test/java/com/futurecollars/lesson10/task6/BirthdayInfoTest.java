package com.futurecollars.lesson10.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class BirthdayInfoTest {

    @Test
    public void shouldCalculateAge() {
        // given
        String dateOfBirth = "1998-04-15";
        int expectedAge = 25;

        // when
        int calculatedAge = BirthdayInfo.calculateAge(dateOfBirth);

        // then
        Assertions.assertEquals(expectedAge, calculatedAge);
    }

    @Test
    public void shouldCalculateDayOfWeek() {
        // given
        String dateOfBirth = "1998-04-15";
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // when
        DayOfWeek calculatedDayOfWeek = BirthdayInfo.calculateDayOfWeek(dateOfBirth);

        // then
        Assertions.assertEquals(expectedDayOfWeek, calculatedDayOfWeek);
    }

    @Test
    public void shouldCalculateWeekOfYear() {
        // given
        String dateOfBirth = "1998-04-15";
        int expectedWeekOfYear = 16;

        // when
        int calculatedWeekOfYear = BirthdayInfo.calculateWeekOfYear(dateOfBirth);

        // then
        Assertions.assertEquals(expectedWeekOfYear, calculatedWeekOfYear);
    }

    @Test
    public void shouldCheckDateFormat() {
        // given
        String invalidDateOfBirth = "1998-04-1";

        // when
        boolean isValidInvalidDate = BirthdayInfo.isDateFormatValid(invalidDateOfBirth);

        // then
        Assertions.assertFalse(isValidInvalidDate);
    }
}
