package com.pluralsight;

import java.util.Scanner;

public class GameScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine(); // Example: Home:Visitor|21:9

        // Split on the pipe '|'
        String[] mainParts = input.split("\\|");
        if (mainParts.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }

        // Split the first part to get team names
        String[] teams = mainParts[0].split(":");
        // Split the second part to get the scores
        String[] scores = mainParts[1].split(":");

        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }

        // Assign names and parse scores
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Determine winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("It's a tie!");
        }
    }
}