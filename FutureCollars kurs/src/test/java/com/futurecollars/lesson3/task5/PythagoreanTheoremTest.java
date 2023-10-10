package com.futurecollars.lesson3.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PythagoreanTheoremTest {

    @Test
    void shouldTriangleBeRight(){
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        //when
        boolean  isTriangleRight = PythagoreanTheorem.isRightTriangle(a, b, c);
        //then
        Assertions.assertTrue(isTriangleRight);
    }

    @Test
    void shouldTriangleBeRightWithNegativeNumber(){
        //given
        int a = -3;
        int b = 4;
        int c = 5;
        //when
        boolean  isTriangleRight = PythagoreanTheorem.isRightTriangle(a, b, c);
        //then
        Assertions.assertFalse(isTriangleRight);
    }

    @Test
    void shouldTriangleBeRightWithZeroNumber(){
        //given
        int a = 0;
        int b = 4;
        int c = 5;
        //when
        boolean  isTriangleRight = PythagoreanTheorem.isRightTriangle(a, b, c);
        //then
        Assertions.assertFalse(isTriangleRight);
    }

    @Test
    void shouldTriangleNotBeRight(){
        //given
        int a = 3;
        int b = 5;
        int c = 5;
        //when
        boolean  isTriangleRight = PythagoreanTheorem.isRightTriangle(a, b, c);
        //then
        Assertions.assertFalse(isTriangleRight);
    }
}
