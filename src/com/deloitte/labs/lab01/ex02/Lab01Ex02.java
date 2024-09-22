package com.deloitte.labs.lab01.ex02;

import java.util.Scanner;

public class Lab01Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice:\n1 -> Red\n2 -> Yellow\n3 -> Green");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("Stop");
			break;

		case 2:
			System.out.println("Ready");
			break;

		case 3:
			System.out.println("Go");
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		sc.close();
	}
}
