package com.pluralsight;

import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Prompt and trim input
        System.out.print("First name: ");
        String first = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middle = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String last = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Build full name
        StringBuilder fullName = new StringBuilder();
        fullName.append(first);

        if (!middle.isEmpty()) {
            fullName.append(" ").append(middle);
        }

        fullName.append(" ").append(last);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        // Display result
        System.out.println("Full name: " + fullName.toString());
    }
}