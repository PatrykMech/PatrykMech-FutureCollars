package com.futurecollars.lesson3.task3;

class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String lastName, int hiringYear) {
        super(firstName, lastName, hiringYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }
}
