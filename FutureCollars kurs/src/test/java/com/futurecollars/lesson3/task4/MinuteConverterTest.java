package com.futurecollars.lesson3.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MinuteConverterTest {

    @Test
    void shouldConvertCorrectlyMinutes(){
        // given
        int minutes = 10;
        //when
        int seconds = MinuteConverter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(600, seconds);
    }

    @Test
    void shouldConvertZero(){
        // given
        int minutes = 0;
        //when
        int seconds = MinuteConverter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(0, seconds);
    }
}
