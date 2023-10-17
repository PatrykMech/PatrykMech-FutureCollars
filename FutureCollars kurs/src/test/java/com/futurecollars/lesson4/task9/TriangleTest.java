package com.futurecollars.lesson4.task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void shouldGiveCorrectString() {
        // Given
        Triangle triangle = new Triangle(3, 6);

        // When
        String resultTriangle = triangle.toString();

        // Then
        Assertions.assertEquals("Triangle{width=3, height=6}", resultTriangle);
    }
}