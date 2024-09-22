package com.deloitte.labs.lab05.ex02;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class Lab05Ex02 {
	public static void validateFullName(String firstName, String lastName) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First name cannot be blank.");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last name cannot be blank.");
        }

        System.out.println("Valid full name: " + firstName + " " + lastName);
    }
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first name:");
    String firstName = scanner.nextLine();

    System.out.println("Enter last name:");
    String lastName = scanner.nextLine();

    try {
        validateFullName(firstName, lastName);
    } catch (InvalidNameException e) {
        System.out.println("Exception: " + e.getMessage());
    }

    scanner.close();
}
}
