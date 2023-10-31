package com.futurecollars.lesson10.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class NumberExtractorTest {

    @Test
    public void shouldFindIntegers() {
        // given
        NumberExtractor extractor = new NumberExtractor();

        // when
        List<String> integers = extractor.findIntegers();

        // then
        Assertions.assertEquals(6, integers.size());
        Assertions.assertTrue(integers.contains("342"));
        Assertions.assertTrue(integers.contains("756"));
        Assertions.assertTrue(integers.contains("3457"));
        Assertions.assertTrue(integers.contains("87"));
        Assertions.assertTrue(integers.contains("3"));
        Assertions.assertTrue(integers.contains("5"));
    }

    @Test
    public void shouldFindFloats() {
        // given
        NumberExtractor extractor = new NumberExtractor();

        // when
        List<String> floats = extractor.findFloats();

        // then
        Assertions.assertEquals(3, floats.size());
        Assertions.assertTrue(floats.contains("5.34"));
        Assertions.assertTrue(floats.contains("6.09"));
        Assertions.assertTrue(floats.contains("1.0001"));
    }

    @Test
    public void shouldFindScientificNotationNumbers() {
        // given
        NumberExtractor extractor = new NumberExtractor();

        // when
        List<String> scientificNotationNumbers = extractor.findScientificNotationNumbers();

        // then
        Assertions.assertEquals(2, scientificNotationNumbers.size());
        Assertions.assertTrue(scientificNotationNumbers.contains("1.234e+07"));
        Assertions.assertTrue(scientificNotationNumbers.contains("7.234243E-02"));
    }
}