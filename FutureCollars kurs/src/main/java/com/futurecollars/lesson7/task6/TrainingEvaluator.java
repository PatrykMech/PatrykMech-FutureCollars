package com.futurecollars.lesson7.task6;

public class TrainingEvaluator {
    public static String evaluateTraining(int duration, int caloriesBurned, int heartRate) {
        int durationScore = calculateDurationScore(duration);
        int caloriesScore = calculateCaloriesScore(caloriesBurned);
        int heartRateScore = calculateHeartRateScore(heartRate);

        double weightedAverage = (durationScore + 2 * caloriesScore + 3 * heartRateScore) / 6.0;

        if (weightedAverage < 1.2) {
            return "Low";
        } else if (weightedAverage >= 1.2 && weightedAverage < 2) {
            return "Good";
        } else if (weightedAverage >= 2 && weightedAverage < 3) {
            return "Very Good";
        } else if (weightedAverage == 3) {
            return "Excellent";
        }

        return null;
    }

    private static int calculateDurationScore(int duration) {
        if (duration < 30) {
            return 1;
        } else if (duration >= 30 && duration <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private static int calculateCaloriesScore(int caloriesBurned) {
        if (caloriesBurned <= 300) {
            return 1;
        } else if (caloriesBurned > 300 && caloriesBurned < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private static int calculateHeartRateScore(int heartRate) {
        if (heartRate < 160) {
            return 3;
        } else if (heartRate >= 160 && heartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
}
