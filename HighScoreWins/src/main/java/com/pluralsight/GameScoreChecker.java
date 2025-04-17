package com.pluralsight;

import java.util.Scanner;

public class GameScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt Enter the game score
        System.out.println("Enter the game score in the format Home|Visitor 21:9");

        // Read prompt
        String input = scanner.nextLine();

        // Split input into team names and scores
        String[] parts = input.split("|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        // Extract team names
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        // Convert scores to integers
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Determine and display the winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("It's a tie!");
        }
    }
}