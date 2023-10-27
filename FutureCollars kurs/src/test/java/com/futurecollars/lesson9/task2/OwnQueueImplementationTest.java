package com.futurecollars.lesson9.task2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class OwnQueueImplementationTest {

    private OwnQueue ownQueue;

    @BeforeEach
    public void setUp() {
        ownQueue = new OwnQueueImplementation();
    }

    @Test
    public void shouldAddElement() {
        // given
        Integer element = 42;

        // when
        boolean result = ownQueue.add(element);

        // then
        assertTrue(result);
    }

    @Test
    public void shouldRemoveElement() {
        // given
        ownQueue.add(1);
        ownQueue.add(2);

        // when
        Integer result = ownQueue.remove();

        // then
        assertEquals(1, result);
    }

    @Test
    public void shouldThrowExceptionWhenRemoveFromEmptyQueue() {
        // when-then
        assertThrows(NoSuchElementException.class, () -> ownQueue.remove());
    }

    @Test
    public void shouldReturnElementWithElementMethod() {
        // given
        ownQueue.add(77);

        // when
        Integer result = ownQueue.element();

        // then
        assertEquals(77, result);
    }

    @Test
    public void shouldThrowExceptionWhenElementFromEmptyQueue() {
        // when-then
        assertThrows(NoSuchElementException.class, () -> ownQueue.element());
    }
}
