package com.deloitte.labs.lab02.ex01;

import java.util.Arrays;

public class Lab02Ex01 {
	public static void main(String[] args) {
		int[] array = { 4, 3, 7, 2, 5, 9 };
		Arrays.sort(array);
		System.out.println(array[array.length - 2]);
	}
}
