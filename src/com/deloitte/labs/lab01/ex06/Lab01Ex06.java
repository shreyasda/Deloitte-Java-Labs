package com.deloitte.labs.lab01.ex06;

import java.util.Scanner;

public class Lab01Ex06 {
	public static int calculateDifference(int n) {
		return squareOfSumOfNumbers(n) - sumOfSquares(n);
	}

	public static int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}

	public static int squareOfSumOfNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum * sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
		sc.close();
	}
}
