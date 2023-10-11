package com.futurecollars.lesson4.task2;

public class Rectangle extends Square {
    private final int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }

    @Override
    public double getArea() {
        return side * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side + width);
    }
}
