package com.deloitte.labs.lab01.ex01;

import java.util.Scanner;

public class Lab01Ex01 {
	public static int sumOfCubes(int number) {
		int sum = 0, rem = 0;
		while (number != 0) {
			rem = number % 10;
			sum += rem * rem * rem;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The sum of the digits of " + number + " is " + sumOfCubes(number));
		sc.close();
	}
}
