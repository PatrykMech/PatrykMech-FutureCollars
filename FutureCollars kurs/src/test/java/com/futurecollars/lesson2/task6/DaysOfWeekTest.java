package com.futurecollars.lesson2.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {
    @Test
    void shouldBeMonday(){
        //given
        int dayNumber = 1;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Monday", dayName);
    }
    @Test
    void shouldBeTuesday(){
        //given
        int dayNumber = 2;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Tuesday", dayName);
    }
    @Test
    void shouldBeWednesday(){
        //given
        int dayNumber = 3;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Wednesday", dayName);
    }
    @Test
    void shouldBeThursday(){
        //given
        int dayNumber = 4;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Thursday", dayName);
    }
    @Test
    void shouldBeFriday(){
        //given
        int dayNumber = 5;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Friday", dayName);
    }
    @Test
    void shouldBeWeekend1(){
        //given
        int dayNumber = 6;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Weekend", dayName);
    }
    @Test
    void shouldBeWeekend2(){
        //given
        int dayNumber = 7;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("Weekend", dayName);
    }
    @Test
    void shouldBeInvalidDay(){
        //given
        int dayNumber = 8;
        //when
        String dayName = DaysOfWeek.whatDayOfWeek(dayNumber);
        //then
        Assertions.assertEquals("There is no such a day!", dayName);
    }
}

