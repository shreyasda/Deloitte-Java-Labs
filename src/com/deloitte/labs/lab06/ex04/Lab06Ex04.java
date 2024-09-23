package com.deloitte.labs.lab06.ex04;

import java.util.HashMap;

public class Lab06Ex04 {
	public static HashMap<String, String> getStudents(HashMap<String, Integer> studentMarks) {
		HashMap<String, String> medalMap = new HashMap<>();

		for (String regNo : studentMarks.keySet()) {
			int marks = studentMarks.get(regNo);

			if (marks >= 90) {
				medalMap.put(regNo, "Gold");
			} else if (marks >= 80 && marks < 90) {
				medalMap.put(regNo, "Silver");
			} else if (marks >= 70 && marks < 80) {
				medalMap.put(regNo, "Bronze");
			}
		}

		return medalMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("S001", 95);
		studentMarks.put("S002", 82);
		studentMarks.put("S003", 75);
		studentMarks.put("S004", 65);
		studentMarks.put("S005", 88);

		HashMap<String, String> medalDetails = getStudents(studentMarks);

		for (String regNo : medalDetails.keySet()) {
			System.out.println("Student Registration No: " + regNo + " | Medal: " + medalDetails.get(regNo));
		}
	}
}
