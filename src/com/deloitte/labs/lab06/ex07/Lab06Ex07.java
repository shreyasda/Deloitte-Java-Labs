package com.deloitte.labs.lab06.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab06Ex07 {
	public static int[] reverseAndSortArray(int[] arr) {
		List<Integer> reversedNumbers = new ArrayList<>();
		for (int number : arr) {
			String reversedStr = new StringBuilder(String.valueOf(number)).reverse().toString();
			int reversedNum = Integer.parseInt(reversedStr);

			reversedNumbers.add(reversedNum);
		}
		Collections.sort(reversedNumbers);
		int[] result = reversedNumbers.stream().mapToInt(i -> i).toArray();
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = { 123, 456, 789, 3451 };
		int[] sortedArray = reverseAndSortArray(numbers);
		System.out.println("Input Array: " + Arrays.toString(numbers));
		System.out.println("Reversed and Sorted Array: " + Arrays.toString(sortedArray));
	}
}
