package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldRectangleAreaAndPerimeterBeCorrect() {

        // Given
        Rectangle rectangle = new Rectangle(6, 4);
        // When
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        // Then
        Assertions.assertEquals(24, area);
        Assertions.assertEquals(20, perimeter);
    }
}
