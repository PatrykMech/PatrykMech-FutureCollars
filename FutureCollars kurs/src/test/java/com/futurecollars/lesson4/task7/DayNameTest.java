package com.futurecollars.lesson4.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayNameTest {

    @Test
    void shouldGiveMonday() {
        // Given
        String printDay = DayName.getDayName(DayOfWeek.MONDAY);

        // Then
        Assertions.assertEquals("Monday", printDay);
    }

    @Test
    void shouldGiveSunday() {
        // Given
        String printDay = DayName.getDayName(DayOfWeek.SUNDAY);

        // Then
        Assertions.assertEquals("Sunday", printDay);
    }
}