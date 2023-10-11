package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void shouldGiveCorrectSquareAreaEquation() {
        // Given
        int side = 5;
        Shape square = new Square(side);

        // When
        int area = square.getArea();

        // Then
        Assertions.assertEquals(25, area);
    }

    @Test
    void shouldGiveCorrectSquarePerimeterEquation() {
        // Given
        int side = 4;
        Shape square = new Square(side);

        // When
        int perimeter = square.getPerimeter();

        // Then
        Assertions.assertEquals(16, perimeter);
    }

    @Test
    void shouldGiveSquareAreaZero() {
        // Given
        int side = 0;
        Shape square = new Square(side);

        // When
        int area = square.getArea();

        // Then
        Assertions.assertEquals(0, area);
    }
}