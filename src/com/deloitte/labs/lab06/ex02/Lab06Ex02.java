package com.deloitte.labs.lab06.ex02;

import java.util.HashMap;

public class Lab06Ex02 {
	public static HashMap<Character, Integer> countCharacters(char[] charArray) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		return charCountMap;
	}

	public static void main(String[] args) {
		char[] charArray = { 'a', 'b', 'c', 'a', 'b', 'a', 'd' };

		HashMap<Character, Integer> counts = countCharacters(charArray);

		for (char key : counts.keySet()) {
			System.out.println(key + ": " + counts.get(key));
		}
	}
}
