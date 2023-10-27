package com.futurecollars.lesson8.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerArrayTest {

    private IntegerArray integerArray;

    @BeforeEach
    void setUp() {
        integerArray = new IntegerArray();
    }


    @Test
    void shouldAddMultipleElements() {
        integerArray.add(2);
        integerArray.add(4);
        integerArray.add(6);
        assertEquals(3, integerArray.size());
        assertEquals(2, integerArray.get(0));
        assertEquals(4, integerArray.get(1));
        assertEquals(6, integerArray.get(2));
    }

    @Test
    void shouldAddElementAtSpecificIndex() {
        integerArray.add(1);
        integerArray.add(3);
        integerArray.add(1, 2);
        assertEquals(3, integerArray.size());
        assertEquals(1, integerArray.get(0));
        assertEquals(2, integerArray.get(1));
        assertEquals(3, integerArray.get(2));
    }

    @Test
    void shouldRemoveElementAtSpecificIndex() {
        integerArray.add(1);
        integerArray.add(3);
        int removedValue = integerArray.remove(0);
        assertEquals(1, removedValue);
        assertEquals(1, integerArray.size());
        assertEquals(3, integerArray.get(0));
    }


    @Test
    void shouldHandleEmptyList() {
        assertTrue(integerArray.isEmpty());
        assertEquals(0, integerArray.size());
    }
}
