package com.futurecollars.lesson3.task1;

public class CinemaSeat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber, boolean isTaken) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isTaken = isTaken;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public String stateOfTheSeat() {
        if (isTaken == true) {
            return "Taken";
        } else {
            return "Free";
        }
    }
}
