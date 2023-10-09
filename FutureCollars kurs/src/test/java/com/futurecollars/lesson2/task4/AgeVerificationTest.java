package com.futurecollars.lesson2.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificationTest {

    @Test
    void shouldBeAdult() {
        int age = 20;

        boolean result = AgeVerification.is18Years(age);

        Assertions.assertTrue(result);

    }

    @Test
    void shouldBeUnderage(){
        int age = 16;

        boolean result = AgeVerification.is18Years(age);

        Assertions.assertFalse(result);
    }
}
