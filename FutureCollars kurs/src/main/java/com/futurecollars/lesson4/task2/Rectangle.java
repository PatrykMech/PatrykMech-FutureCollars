package com.futurecollars.lesson4.task2;

public class Rectangle extends Shape {
    private final int length;
    private final int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
}
