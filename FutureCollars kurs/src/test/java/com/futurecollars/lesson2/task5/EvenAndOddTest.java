package com.futurecollars.lesson2.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenAndOddTest {

    @Test
    void shouldBeEven(){
        int number = 6;
        boolean result = EvenAndOdd.isEven(number);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotBeEven(){
        int number = 5;
        boolean result = EvenAndOdd.isEven(number);
        Assertions.assertFalse(result);
    }

    @Test
    void shouldZeroBeEven(){
        int number = 0;
        boolean result = EvenAndOdd.isEven(number);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldBeOdd(){
        int number = 5;
        boolean result = EvenAndOdd.isOdd(number);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotBeOdd(){
        int number = 6;
        boolean result = EvenAndOdd.isOdd(number);
        Assertions.assertFalse(result);
    }

    @Test
    void shouldNegativeBeOdd(){
        int number = -3;
        boolean result = EvenAndOdd.isOdd(number);
        Assertions.assertTrue(result);
    }
}
