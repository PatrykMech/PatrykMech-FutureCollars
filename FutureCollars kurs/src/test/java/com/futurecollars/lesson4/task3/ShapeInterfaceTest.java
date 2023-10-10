package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeInterfaceTest {

    @Test
    void shouldSquareAreaAndPerimeterBeCorrect() {

        // Given
        Square square = new Square(6);
        // When
        int area = square.getArea();
        int perimeter = square.getPerimeter();
        // Then
        Assertions.assertEquals(36, area);
        Assertions.assertEquals(24, perimeter);
    }

    @Test
    void shouldRectangleAreaAndPerimeterBeCorrect() {

        // Given
        Rectangle rectangle = new Rectangle(3, 4);
        // When
        int area = rectangle.getArea();
        int perimeter = rectangle.getPerimeter();
        // Then
        Assertions.assertEquals(12, area);
        Assertions.assertEquals(14, perimeter);
    }
}
