package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        }

        System.out.println("Launch!");
    }
}

