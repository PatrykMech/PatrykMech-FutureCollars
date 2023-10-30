package com.futurecollars.lesson10.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeselValidatorTest {

    @Test
    public void shouldValidatePesel() {
        // Given
        String validPesel = "95011112345";

        // When
        boolean isValid = PeselValidator.validatePesel(validPesel);

        // Then
        Assertions.assertTrue(isValid);
    }

    @Test
    public void shouldInvalidatePesel() {
        // Given
        String invalidPesel = "A501111234Z";

        // When
        boolean isValid = PeselValidator.validatePesel(invalidPesel);

        // Then
        Assertions.assertFalse(isValid);
    }

    @Test
    public void shouldInvalidatePeselWithWrongLength() {
        // Given
        String peselWithWrongLength = "8001011234";

        // When
        boolean isValid = PeselValidator.validatePesel(peselWithWrongLength);

        // Then
        Assertions.assertFalse(isValid);
    }
}
