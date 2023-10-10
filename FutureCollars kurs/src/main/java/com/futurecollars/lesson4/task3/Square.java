package com.futurecollars.lesson4.task3;

public class Square implements ShapeInterface {
    private final int side;

    public Square(int side){
        this.side = side;
    }
    @Override
    public int getArea(){
        return side * side;
    }
    @Override
    public int getPerimeter(){
        return 4 * side;
    }
}
