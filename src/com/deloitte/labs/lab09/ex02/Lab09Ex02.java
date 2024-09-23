package com.deloitte.labs.lab09.ex02;

import java.util.function.Function;

public class Lab09Ex02 {
	public static void main(String[] args) {
		String input = "ABCDE";
		Function<String, String> insertSpaces = s -> String.join(" ", s.split(""));
		String result = insertSpaces.apply(input);
		System.out.println("Formatted string: \"" + result + "\"");
	}
}
