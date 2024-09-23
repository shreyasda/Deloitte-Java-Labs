package com.deloitte.labs.lab09.ex05;

import java.util.function.Function;

public class Lab09Ex05 {
	public static int calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * calculateFactorial(n - 1);
	}

	public static void main(String[] args) {
		Function<Integer, Integer> factorialFunc = Lab09Ex05::calculateFactorial;

		int number = 5;
		int result = factorialFunc.apply(number);

		System.out.println("Factorial of " + number + " is: " + result);
	}
}
