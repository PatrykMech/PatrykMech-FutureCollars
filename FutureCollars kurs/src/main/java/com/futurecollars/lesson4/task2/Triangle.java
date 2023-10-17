package com.futurecollars.lesson4.task2;

class Triangle extends Shape {
    private final int base;
    private final int baseHeight;
    private final int side2;
    private final int side3;

    public Triangle(int base, int baseHeight, int side2, int side3) {
        this.base = base;
        this.baseHeight = baseHeight;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return 0.5 * base * baseHeight;
    }

    @Override
    public double getPerimeter() {
        return base + side2 + side3;
    }
}
