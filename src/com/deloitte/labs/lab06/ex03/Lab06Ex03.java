package com.deloitte.labs.lab06.ex03;

import java.util.HashMap;

public class Lab06Ex03 {
	public static HashMap<Integer, Integer> getNumberSquares(int[] numbers) {
		HashMap<Integer, Integer> squareMap = new HashMap<>();
		for (int number : numbers) {
			squareMap.put(number, number * number);
		}

		return squareMap;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		HashMap<Integer, Integer> result = getNumberSquares(numbers);
		for (int key : result.keySet()) {
			System.out.println(key + ": " + result.get(key));
		}
	}
}
