package com.futurecollars.lesson3.task3;

public class Task3Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Doe",  2010);
        TicketSeller ticketSeller = new TicketSeller("Adam", "Smith",  2015);

        manager.setBonus(750);
        manager.displayInformation();
        ticketSeller.displayInformation();
    }
}
