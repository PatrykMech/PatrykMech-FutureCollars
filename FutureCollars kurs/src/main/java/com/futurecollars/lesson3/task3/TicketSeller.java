package com.futurecollars.lesson3.task3;

class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String lastName, int hiringYear) {
        super(firstName, lastName, hiringYear);
        this.salary = 3000;
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }

    @Override
    public void displayInformation() {
        System.out.println("Position: Ticket Seller");
        super.displayInformation();
        System.out.println("");
    }
}
