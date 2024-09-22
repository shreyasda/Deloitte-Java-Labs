package com.deloitte.labs.lab03.ex06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab03Ex06 {
	public static void printDuration(LocalDate givenDate) {
		LocalDate currentDate = LocalDate.now();

		Period period = Period.between(givenDate, currentDate);

		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		System.out.println("Duration:");
		System.out.println(years + " years, " + months + " months, and " + days + " days.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date (in format dd-MM-yyyy):");
		String inputDate = scanner.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate givenDate = LocalDate.parse(inputDate, formatter);

		printDuration(givenDate);

		scanner.close();
	}
}
