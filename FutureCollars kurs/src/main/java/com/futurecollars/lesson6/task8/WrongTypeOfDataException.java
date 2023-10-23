package com.futurecollars.lesson6.task8;

public class WrongTypeOfDataException extends Throwable {
    public WrongTypeOfDataException(String wrongTypeOfData) {
        super(wrongTypeOfData);
    }
}
