package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void shouldTriangleAreaAndPerimeterBeCorrect() {

        // Given
        Triangle triangle = new Triangle(2, 4, 3, 5);
        // When
        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();
        // Then
        Assertions.assertEquals(4, area);
        Assertions.assertEquals(10, perimeter);
    }
}
