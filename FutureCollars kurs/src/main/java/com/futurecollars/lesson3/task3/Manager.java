package com.futurecollars.lesson3.task3;

class Manager extends BaseEmployee {
    private int bonus;

    public Manager(String firstName, String lastName, int hiringYear) {
        super(firstName, lastName, hiringYear);
        this.salary = 5000;
        this.bonus = 500;
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayInformation() {
        System.out.println("Position: Manager");
        super.displayInformation();
        System.out.println("");
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
