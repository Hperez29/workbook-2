package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their full name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Remove extra spaces at the beginning and end
        name = name.trim();

        // Split the name into parts (words)
        String[] parts = name.split(" ");

        // Check how many parts were entered
        if (parts.length == 2) {
            // First and last name
            System.out.println("First name: " + parts[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + parts[1]);
        } else if (parts.length == 3) {
            // First, middle, and last name
            System.out.println("First name: " + parts[0]);
            System.out.println("Middle name: " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        } else {
            // Invalid input
            System.out.println("Invalid input. Please enter a name with 2 or 3 words.");
        }

        scanner.close();
    }
}