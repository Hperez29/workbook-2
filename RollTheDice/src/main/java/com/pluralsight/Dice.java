package com.pluralsight;

public class Dice {
    // Method to roll the dice
    public int roll() {
        return (int) (Math.random() * 6) + 1; // 1 to 6
    }
}
