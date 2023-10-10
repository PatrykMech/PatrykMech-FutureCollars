package com.futurecollars.lesson3.task1;

public class Task1Main {
    public static void main(String[] args) {
        CinemaSeat cinemaSeat = new CinemaSeat(9, 11, true);
        System.out.println("Seat number: " + cinemaSeat.getSeatNumber());
        System.out.println("Row number: " + cinemaSeat.getRowNumber());
        System.out.println("Free/ Taken: " + cinemaSeat.stateOfTheSeat());
    }
}
