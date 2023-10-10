package com.futurecollars.lesson3.task5;

public class PythagoreanTheorem {
    public static boolean isRightTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (isRightTriangle(a, b, c)) {
            System.out.println("Th triangle is a right-angled triangle");
        } else {
            System.out.println("The triangle is NOT a right-angled triangle");
        }
    }
}
