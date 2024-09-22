package com.deloitte.labs.lab02.ex03;

public class Lab02Ex03 {
	public static void main(String[] args) {
		int[] numbers = { 12, 32, 78, 54, 98, 27, 69 };
		String[] strNums = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			strNums[i] = Integer.toString(numbers[i]);
			System.out.println(strNums[i]);
		}
		for (int i = 0; i < strNums.length; i++) {
			strNums[i] = new StringBuilder(strNums[i]).reverse().toString();
			System.out.println(strNums[i]);
		}
	}
}
