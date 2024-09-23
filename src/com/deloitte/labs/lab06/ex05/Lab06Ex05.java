package com.deloitte.labs.lab06.ex05;

import java.util.Arrays;

public class Lab06Ex05 {
	public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        Arrays.sort(arr);
        return arr[1];
    }
public static void main(String[] args) {
	int[] numbers = {4, 1, 3, 5, 2};
    int secondSmallest = getSecondSmallest(numbers);
    System.out.println("The second smallest element is: " + secondSmallest);

}
}
