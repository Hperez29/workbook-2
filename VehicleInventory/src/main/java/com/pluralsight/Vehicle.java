package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void display() {
        System.out.printf("ID: %d | Make/Model: %s | Color: %s | Odometer: %d | Price: $%.2f\n",
                vehicleId, makeModel, color, odometerReading, price);
    }
}
