package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] inventory = new Vehicle[20];
        int vehicleCount = 6;

        // Preloaded vehicles
        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        boolean running = true;

        while (running) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (command) {
                case 1:
                    System.out.println("\n--- Vehicle List ---");
                    for (int i = 0; i < vehicleCount; i++) {
                        inventory[i].display();
                    }
                    break;

                case 2:
                    System.out.print("Enter make/model to search: ");
                    String modelSearch = scanner.nextLine().toLowerCase();
                    boolean foundModel = false;
                    for (int i = 0; i < vehicleCount; i++) {
                        if (inventory[i].getMakeModel().toLowerCase().contains(modelSearch)) {
                            inventory[i].display();
                            foundModel = true;
                        }
                    }
                    if (!foundModel) {
                        System.out.println("No vehicles found with that make/model.");
                    }
                    break;

                case 5:
                    if (vehicleCount < inventory.length) {
                        System.out.print("Enter vehicle ID: ");
                        long id = scanner.nextLong();
                        scanner.nextLine(); // consume newline

                        System.out.print("Enter make/model: ");
                        String makeModel = scanner.nextLine();

                        System.out.print("Enter color: ");
                        String color = scanner.nextLine();

                        System.out.print("Enter odometer reading: ");
                        int odo = scanner.nextInt();

                        System.out.print("Enter price: ");
                        float price = scanner.nextFloat();

                        inventory[vehicleCount++] = new Vehicle(id, makeModel, color, odo, price);
                        System.out.println("Vehicle added successfully.");
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid command. Please choose 1-6.");
            }
        }

        scanner.close();
    }
}