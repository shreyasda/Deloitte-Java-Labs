package com.deloitte.labs.lab01.ex05;

import java.util.Scanner;

public class Lab01Ex05 {
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
		sc.close();
	}
}
