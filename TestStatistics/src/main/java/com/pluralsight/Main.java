package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample array of 10 test scores
        int[] scores = {85, 92, 78, 94, 88, 76, 95, 89, 84, 91};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        // Calculate sum, high and low
        for (int score : scores) {
            sum += score;
            if (score > high) high = score;
            if (score < low) low = score;
        }

        double average = (double) sum / scores.length;

        // Sort the array to calculate median
        Arrays.sort(scores);

        double median;
        int mid = scores.length / 2;
        if (scores.length % 2 == 0) {
            median = (scores[mid - 1] + scores[mid]) / 2.0;
        } else {
            median = scores[mid];
        }

        // Display results
        System.out.println("Test Scores: " + Arrays.toString(scores));
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);
        System.out.printf("Median Score: %.2f%n", median);
        System.out.printf("Difference between average and median: %.2f%n", Math.abs(average - median));
    }
}