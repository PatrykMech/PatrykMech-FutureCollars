package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void shouldCircleAreaAndPerimeterBeCorrect() {

        // Given
        Circle circle = new Circle(3);
        // When
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        // Then
        Assertions.assertEquals(28.259999999999998, area);
        Assertions.assertEquals(18.84, perimeter);
    }
}
