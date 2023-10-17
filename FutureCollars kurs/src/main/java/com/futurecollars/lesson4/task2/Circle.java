package com.futurecollars.lesson4.task2;

class Circle extends Shape {
    private final int radius;
    private static final double PI_NUMBER = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI_NUMBER * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI_NUMBER * radius;
    }
}

