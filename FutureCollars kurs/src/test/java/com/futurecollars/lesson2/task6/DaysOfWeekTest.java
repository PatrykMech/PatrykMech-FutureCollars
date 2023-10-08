package com.futurecollars.lesson2.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {
    @Test
    void testWhatDayOfWeek(){
        Assertions.assertEquals("Monday", DaysOfWeek.whatDayOfWeek(1));
        Assertions.assertEquals("Tuesday", DaysOfWeek.whatDayOfWeek(2));
        Assertions.assertEquals("Wednesday", DaysOfWeek.whatDayOfWeek(3));
        Assertions.assertEquals("Thursday", DaysOfWeek.whatDayOfWeek(4));
        Assertions.assertEquals("Friday", DaysOfWeek.whatDayOfWeek(5));
        Assertions.assertEquals("Weekend", DaysOfWeek.whatDayOfWeek(6));
        Assertions.assertEquals("Weekend", DaysOfWeek.whatDayOfWeek(7));
        Assertions.assertEquals("There is no such a day!", DaysOfWeek.whatDayOfWeek(8));
    }

    @Test
    void testDayName() {
        Assertions.assertEquals("Monday", DaysOfWeek.dayName(1));
        Assertions.assertEquals("Tuesday", DaysOfWeek.dayName(2));
        Assertions.assertEquals("Wednesday", DaysOfWeek.dayName(3));
        Assertions.assertEquals("Thursday", DaysOfWeek.dayName(4));
        Assertions.assertEquals("Friday", DaysOfWeek.dayName(5));
        Assertions.assertEquals("Weekend", DaysOfWeek.dayName(6));
        Assertions.assertEquals("Weekend", DaysOfWeek.dayName(7));
        Assertions.assertEquals("", DaysOfWeek.dayName(8));
    }
}

