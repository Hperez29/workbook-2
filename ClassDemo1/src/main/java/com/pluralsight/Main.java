package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullname;
        int age;
        String profession;

        System.out.println("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the CRLF

        System.out.println("What is the person's profession: ");
        profession = scanner.nextLine();

        Person thePerson = new Person(fullname, age, profession);

        System.out.println(thePerson.getFullname());


        System.out.println("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the CRLF

        System.out.println("What is the person's profession: ");
        profession = scanner.nextLine();

        Person theOtherPerson = new Person(fullname, age, profession);
        System.out.println(theOtherPerson.getFullname());

        displayPerson(fullname, age, profession);
        savePerson(fullname, age, profession);

    }

    public static void displayPerson(String fullname, int age, String profession){
        System.out.printf("Person %s is a %s and is %d years old.", fullname, profession, age);
    }

    public static void savePerson(String fullname, int age, String profession){
        // do the work of saving a person to a database

    }
}