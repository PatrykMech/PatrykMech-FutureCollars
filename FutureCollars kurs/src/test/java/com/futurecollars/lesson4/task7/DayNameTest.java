package com.futurecollars.lesson4.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayNameTest {

    @Test
    void shouldGiveMonday() {
        // When
        DayName dayName = new DayName();

        // Given
        String printDay = dayName.showDayName(DayOfWeek.MONDAY);

        // Then
        Assertions.assertEquals("Monday", printDay);
    }

    @Test
    void shouldGiveSunday() {
        // When
        DayName dayName = new DayName();

        // Given
        String printDay = dayName.showDayName(DayOfWeek.SUNDAY);

        // Then
        Assertions.assertEquals("Sunday", printDay);
    }
}