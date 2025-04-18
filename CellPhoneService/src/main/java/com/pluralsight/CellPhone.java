package com.pluralsight;

public class CellPhone {
    // Data members
    private int serialNumber; // example, 7123890 - 2234521
    private String model; // example, iPhone 14
    private String carrier; // example, T-Mobile
    private String phoneNumber; // example, 646-322-1834
    private String owner; // Herbie Perez

    // Default constructor (parameterless) with default values
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    // Getter and Setter for serialNumber
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for carrier
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;

    }

    // Method to display the details of the CellPhone object
    public String toString() {
        return String.format("Serial Number: %d\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s",
                serialNumber, model, carrier, phoneNumber, owner);
    }

    // Method to simulate dialing another phone
    public void dial(String phoneNumber) {
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
}



