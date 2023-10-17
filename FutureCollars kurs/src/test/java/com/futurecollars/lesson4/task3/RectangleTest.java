package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void shouldGiveCorrectRectangleAreaEquation() {
        // Given
        int length = 5;
        int width = 3;
        Rectangle rectangle = new Rectangle(length, width);

        // When
        int area = rectangle.getArea();

        // Then
        Assertions.assertEquals(15, area);
    }

    @Test
    void shouldGiveCorrectRectanglePerimeterEquation() {
        // Given
        int length = 4;
        int width = 6;
        Shape rectangle = new Rectangle(length, width);

        // When
        int perimeter = rectangle.getPerimeter();

        // Then
        Assertions.assertEquals(20, perimeter);
    }

    @Test
    void shouldGiveRectangleAreaZero() {
        // Given
        int length = 0;
        int width = 10;
        Shape rectangle = new Rectangle(length, width);

        // When
        int area = rectangle.getArea();

        // Then
        Assertions.assertEquals(0, area);
    }
}
