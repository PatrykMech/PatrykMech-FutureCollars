package com.futurecollars.lesson6.task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PeselValidatorTest {

    @Test
    public void shouldValidateValidPesel() {
        // Given
        String validPesel = "12345678901";

        // When
        Assertions.assertDoesNotThrow(() -> PeselValidator.validatePesel(validPesel));
    }

    @Test
    public void shouldThrowWrongTypeException() {
        // Given
        String invalidTypePesel = "ABCD5678901";

        // When
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> PeselValidator.validatePesel(invalidTypePesel));

        // Then
        Assertions.assertEquals("Wrong type", ex.getMessage());
    }

    @Test
    public void shouldThrowWrongLengthException() {
        // Given
        String invalidLengthPesel = "1234567890";

        // When
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> PeselValidator.validatePesel(invalidLengthPesel));

        // Then
        Assertions.assertEquals("Wrong length of PESEL", ex.getMessage());
    }
}

