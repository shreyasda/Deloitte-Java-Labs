package com.deloitte.labs.lab03.ex04;

import java.util.Scanner;

public class Lab03Ex04 {
	public static int differenceString(int num) {
		String numStr = Integer.toString(num);
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < numStr.length() - 1; i++) {
			int digit1 = numStr.charAt(i) - '0';
			int digit2 = numStr.charAt(i + 1) - '0';
			int difference = Math.abs(digit2 - digit1);
			res.append(difference);
		}
		char ch = numStr.charAt(numStr.length() - 1);
		res.append(ch);
		return Integer.parseInt(res.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println(differenceString(num));
	}
}
