package com.futurecollars.lesson3.task5;

public class TriangleUtils {
    public static boolean isRightTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
}
