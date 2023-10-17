package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void shouldSquareAreaAndPerimeterBeCorrect() {

        // Given
        Square square = new Square(6);
        // When
        double area = square.getArea();
        double perimeter = square.getPerimeter();
        // Then
        Assertions.assertEquals(36, area);
        Assertions.assertEquals(24, perimeter);
    }
}
