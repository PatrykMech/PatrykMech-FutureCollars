package com.futurecollars.lesson4.task6;

public class BillCalculator {
    public double calculate(double billValue, float serviceCharge) {
        return billValue + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, double discount) {
        double discountedBill = billValue - discount;
        return discountedBill + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, short takeoutCharge) {
        return billValue + serviceCharge + takeoutCharge;
    }
}
