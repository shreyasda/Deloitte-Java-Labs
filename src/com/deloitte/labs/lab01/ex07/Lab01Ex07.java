package com.deloitte.labs.lab01.ex07;

import java.util.Scanner;

public class Lab01Ex07 {
	public static boolean checkNumber(int n) {
		if (n < 0) {
			return false;
		}

		String num = Integer.toString(n);
		char[] number = num.toCharArray();
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] > number[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
}
