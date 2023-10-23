package com.futurecollars.lesson7.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TextLengthGetterTest {
    @ParameterizedTest
    @MethodSource("provideText")
    void shouldCalculateTextLength(String input, int expectedLength) {
        int result = TextLengthGetter.calculateTextLength(input);
        Assertions.assertEquals(expectedLength, result);
    }

    private static Stream<Arguments> provideText() {
        return Stream.of(
                Arguments.of("patryk", 6),
                Arguments.of("123abc456DEF/;&gh", 17),
                Arguments.of("Hello World", 11),
                Arguments.of("", 0),
                Arguments.of(null, 0)
        );
    }
}

