package com.futurecollars.lesson6.task8;

public class IllegalLengthException extends Throwable {
    public IllegalLengthException(String wrongLengthOfPesel) {
        super(wrongLengthOfPesel);
    }
}
