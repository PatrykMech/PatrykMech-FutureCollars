package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    void shouldSquareAreaAndPerimeterBeCorrect() {

        // Given
        Square square = new Square(4);
        // When
        double area = square.getArea();
        double perimeter = square.getPerimeter();
        // Then
        Assertions.assertEquals(16, area);
        Assertions.assertEquals(16, perimeter);
    }

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
