package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the user's full name
        System.out.print("Please enter your name: ");
        String fullName = input.nextLine();

        // Ask for the date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();

        // Ask for the number of tickets
        System.out.print("How many tickets would you like? ");
        int tickets = input.nextInt();

        // Split the name into first and last
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names.length > 1 ? names[1] : "";

        // Decide whether to say "ticket" or "tickets"
        String ticketWord = "ticket";
        if (tickets > 1) {
            ticketWord = "tickets";
        }

        // Print confirmation message
        System.out.println(tickets + " " + ticketWord + " reserved for " + date + " under " + lastName + ", " + firstName);

        input.close();
    }
}

















    }
}