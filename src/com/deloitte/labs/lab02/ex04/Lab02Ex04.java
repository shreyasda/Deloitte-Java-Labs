package com.deloitte.labs.lab02.ex04;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab02Ex04 {
	public static Integer[] removeDuplicates(int[] array) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : array) {
			set.add(num);
		}

		Integer[] resultArray = set.toArray(new Integer[0]);

		Arrays.sort(resultArray, Collections.reverseOrder());

		return resultArray;
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 6, 9, 4, 7, 2, 1, 7, 5, 9 };
		System.out.println("Array before sorting: " + Arrays.toString(array));
		Integer[] result = removeDuplicates(array);
		System.out.println("Array after sorting: " + Arrays.toString(result));
	}
}
