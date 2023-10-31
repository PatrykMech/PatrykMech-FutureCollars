package com.futurecollars.lesson10.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


public class NumberExtractorTest {

    @Test
    public void shouldExtractNumbers() {
        // Given
        NumberExtractor extractor = new NumberExtractor();
        List<String> valueList = Arrays.asList(
                "342", "5.34", "756", "1.234e+07", "7.234243E-02", "6.09", "3457", "87", "1.0001", "3", "5"
        );

        // When
        List<String> integers = extractor.findIntegers(valueList);
        List<String> floats = extractor.findFloats(valueList);
        List<String> scientificNotationNumbers = extractor.findScientificNotationNumbers(valueList);

        // Then
        List<String> expectedIntegers = Arrays.asList("342", "756", "3457", "87", "3", "5");
        List<String> expectedFloats = Arrays.asList("5.34", "6.09", "1.0001");
        List<String> expectedScientificNotationNumbers = Arrays.asList("1.234e+07", "7.234243E-02");

        Assertions.assertEquals(expectedIntegers, integers);
        Assertions.assertEquals(expectedFloats, floats);
        Assertions.assertEquals(expectedScientificNotationNumbers, scientificNotationNumbers);
    }
}