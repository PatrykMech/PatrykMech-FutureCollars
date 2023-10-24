package com.futurecollars.lesson7.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmployeeSalaryCalculatorTest {
    @Test
    public void shouldCalculateEmployeeSalary() {
        // Given
        BasicSalaryService basicSalaryService = Mockito.mock(BasicSalaryService.class);
        SaturdayBonusService saturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        Mockito.when(basicSalaryService.getBasicSalary()).thenReturn(4000.0);
        Mockito.when(saturdayBonusService.getSaturdayBonus()).thenReturn(500.0);
        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator(basicSalaryService, saturdayBonusService);

        // When
        double result = calculator.calculateEmployeeSalary(800.0, 2);

        // Then
        Assertions.assertEquals(5800.0, result);
    }
}
