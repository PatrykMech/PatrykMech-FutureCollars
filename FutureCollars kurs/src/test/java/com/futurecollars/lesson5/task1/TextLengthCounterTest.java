package com.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextLengthCounterTest {

    @Test
    public void shouldCountTextLength() {
        //Given
        String text = "kayak";
        //Then
        int length = TextLengthCounter.getTextLength(text);
        //When
        Assertions.assertEquals(5, length);
    }
}