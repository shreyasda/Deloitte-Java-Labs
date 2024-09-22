package com.deloitte.labs.lab01.ex08;

import java.util.Scanner;

public class Lab01Ex08 {
	public static boolean checkNumber(int n) {
		if (n < 0) {
			return false;
		}
		while (n % 2 == 0) {
			n /= 2;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
}
