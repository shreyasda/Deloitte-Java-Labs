package com.deloitte.labs.lab03.ex05;

public class Lab03Ex05 {
public static void main(String[] args) {
	String text = "This program calculates\nnumber of words, character\nlines";

    int charCount = 0;
    int wordCount = 0;
    int lineCount = 0;

    String[] lines = text.split("\n");
    lineCount = lines.length;

    for (String line : lines) {
        charCount += line.length();
        
        if (!line.trim().isEmpty()) {
            String[] words = line.trim().split("\\s+");
            wordCount += words.length;
        }
    }

    System.out.println("Text Statistics:");
    System.out.println("Number of characters: " + charCount);
    System.out.println("Number of words: " + wordCount);
    System.out.println("Number of lines: " + lineCount);
}
}
