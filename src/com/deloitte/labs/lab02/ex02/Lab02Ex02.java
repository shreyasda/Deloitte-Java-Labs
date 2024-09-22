package com.deloitte.labs.lab02.ex02;

import java.util.Arrays;

public class Lab02Ex02 {
	public static void sortStrings(String[] strArray) {
		Arrays.sort(strArray);
		for (String string : strArray) {
			System.out.println(string);
		}
		if(strArray.length % 2 != 0) {
			for(int i = 0; i < (strArray.length / 2) + 1; i++) {
				strArray[i] = strArray[i].toUpperCase();
			}
		}
		else {
			for(int i = 0; i < strArray.length / 2; i++) {
				strArray[i] = strArray[i].toUpperCase();
			}
		}		
		for (String string : strArray) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		String[] strArray = {"shreyas", "abc", "rahul", "pant", "jaiswal", "karthik", "ravi"};
		sortStrings(strArray);
	}
}
