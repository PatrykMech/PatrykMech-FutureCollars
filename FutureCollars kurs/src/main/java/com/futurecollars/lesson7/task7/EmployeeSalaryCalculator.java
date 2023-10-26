package com.futurecollars.lesson7.task7;

public class EmployeeSalaryCalculator {
    private final BasicSalaryService basicSalaryService;
    private final SaturdayBonusService saturdayBonusService;

    public EmployeeSalaryCalculator(BasicSalaryService basicSalaryService, SaturdayBonusService saturdayBonusService) {
        this.basicSalaryService = basicSalaryService;
        this.saturdayBonusService = saturdayBonusService;
    }

    public double calculateEmployeeSalary(double oneTimeBonus, int numberOfSaturdays) {
        double basicSalary = this.basicSalaryService.getBasicSalary();
        double saturdayBonus = this.saturdayBonusService.getSaturdayBonus();
        return basicSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
    }
}
