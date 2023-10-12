package com.futurecollars.lesson3.task3;

class Manager extends BaseEmployee {
    private int BONUS = 500;

    public Manager(String firstName, String lastName, int hiringYear) {
        super(firstName, lastName, hiringYear);
        this.SALARY = 5000;
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary() + BONUS;
    }

    public void setBonus(int BONUS) {
        this.BONUS = BONUS;
    }
}
