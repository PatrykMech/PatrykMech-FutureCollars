package com.futurecollars.lesson7.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TrainingEvaluatorTest {

    @ParameterizedTest
    @CsvSource({
            "20, 200, 200, Low",
            "25, 350, 165, Good",
            "30, 370, 175, Very Good",
            "70, 500, 150, Excellent"
    })
    public void shouldEvaluateTraining(int duration, int caloriesBurned, int heartRate, String expectedEvaluation) {
        String evaluation = TrainingEvaluator.evaluateTraining(duration, caloriesBurned, heartRate);
        Assertions.assertEquals(expectedEvaluation, evaluation);
    }
}
