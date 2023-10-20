package com.futurecollars.lesson3.task3;

public abstract class BaseEmployee {
    private final String firstName;
    private final String lastName;
    protected int SALARY = 3000;
    private final int hiringYear;


    public BaseEmployee(String firstName, String lastName, int hiringYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringYear = hiringYear;
    }

    public int getSalary() {
        return SALARY;
    }

    public int yearsOfWork() {
        return 2023 - hiringYear;
    }

    public abstract int calculateMonthlySalary();

}
