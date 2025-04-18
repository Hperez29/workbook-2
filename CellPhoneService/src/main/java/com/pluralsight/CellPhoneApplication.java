package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Create a new CellPhone object
        CellPhone myPhone = new CellPhone();

        // Prompt the user for the cell phone information
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read the serial number

        scanner.nextLine();  // Consume the newline character left after nextInt()

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read the model

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();  // Read the carrier

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();  // Read the phone number

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();  // Read the owner's name

        // Set the values using setter methods
        myPhone.setSerialNumber(1234567);
        myPhone.setModel("iPhone 14");
        myPhone.setCarrier("T-Mobile");
        myPhone.setPhoneNumber("646-322-1834");
        myPhone.setOwner("Herbie Perez");

        // Get the values using getter methods
        System.out.println("Phone Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        // Output the details of the cell phone using getters and the toString method
        System.out.println("\nCell Phone Information:");
        System.out.println(myPhone.toString());


        // Close the scanner
        scanner.close();

    }
}