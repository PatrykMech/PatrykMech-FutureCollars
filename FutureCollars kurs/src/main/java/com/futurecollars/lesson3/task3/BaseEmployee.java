package com.futurecollars.lesson3.task3;

public abstract class BaseEmployee {
    private final String firstName;
    private final String lastName;
    public int salary = 3000;
    private final int hiringYear;



    public BaseEmployee(String firstName, String lastName, int hiringYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringYear = hiringYear;
    }
    public int getSalary() {
        return salary;
    }

    public int yearsOfWork(){
        return 2023 - hiringYear;
    }

    public abstract int calculateMonthlySalary();

    public void displayInformation() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Hire Year: " + hiringYear);
        System.out.println("Years of Service: " + yearsOfWork());
        System.out.println("Monthly salary: $" + calculateMonthlySalary());
    }
}
