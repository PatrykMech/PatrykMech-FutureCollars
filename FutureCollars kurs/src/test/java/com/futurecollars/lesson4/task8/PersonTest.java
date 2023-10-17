package com.futurecollars.lesson4.task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void shouldPersonsBeEqual() {
        // Given
        Person person1 = new Person("Adam", 27);
        Person person2 = new Person("Adam", 27);

        // When
        boolean result = person1.equals(person2);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldPersonsDoNotBeEqual() {
        // Given
        Person person1 = new Person("Adam", 27);
        Person person3 = new Person("Ewa", 26);

        // When
        boolean result = person1.equals(person3);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldHashCodeMatch() {
        // Given
        Person person1 = new Person("Adam", 27);
        Person person2 = new Person("Adam", 27);

        // When
        int hashCode1 = person1.hashCode();
        int hashCode2 = person2.hashCode();

        // Then
        Assertions.assertEquals(hashCode1, hashCode2);
    }
}
