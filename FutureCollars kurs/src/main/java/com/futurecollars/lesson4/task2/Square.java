package com.futurecollars.lesson4.task2;

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}