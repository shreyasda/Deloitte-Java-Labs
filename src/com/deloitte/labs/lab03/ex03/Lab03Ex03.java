package com.deloitte.labs.lab03.ex03;

import java.util.Scanner;

public class Lab03Ex03 {
	public static String replaceConsonants(String word) {
		String vowels = "aeiouAEIOU";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
				if (ch == 'z') {
					result.append('a');
				} else if (ch == 'Z') {
					result.append('A');
				} else {
					result.append((char)(ch + 1));
				}
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		System.out.println("Entered String is: " + word);
		System.out.println("Resultant String is: " + replaceConsonants(word));
	}
}
