package com.futurecollars.lesson4.task3;

public class Rectangle implements ShapeInterface {
    private final int length;
    private final int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public int getArea(){
        return length * width;
    }
    @Override
    public int getPerimeter(){
        return 2*(length + width);
    }
}
