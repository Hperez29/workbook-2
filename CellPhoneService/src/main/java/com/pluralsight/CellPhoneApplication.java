package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a new CellPhone object
        CellPhone myPhone = new CellPhone();

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
    }
}