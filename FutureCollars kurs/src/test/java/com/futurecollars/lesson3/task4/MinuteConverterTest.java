package com.futurecollars.lesson3.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinuteConverterTest {

    @Test
    void shouldConvertCorrectlyMinutes(){
        // given
        int minutes = 10;
        //when
        String secondsAfterConvert = MinuteConverter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals("600", secondsAfterConvert);
    }

    @Test
    void shouldConvertZero(){
        // given
        int minutes = 0;
        //when
        String secondsAfterConvert = MinuteConverter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals("0", secondsAfterConvert);
    }

    @Test
    void shouldConvertNegativeNumbers() {
        // given
        int minutes = -5;
        //when
        String errorMessage = MinuteConverter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals("Minutes can't be negative", errorMessage);
    }
}
