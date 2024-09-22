package com.deloitte.labs.lab05.ex01;

import java.util.Scanner;

class IllegalAgeException extends Exception{
	public IllegalAgeException(String s){
		super(s);
	}
}
public class Lab05Ex01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		int age = sc.nextInt();
		if(age < 15) {
			throw new IllegalAgeException("Enter Valid Age");
		}
		System.out.println("Age is: "+age);
	}
	catch(IllegalAgeException e) {
		System.out.println(e.getMessage());
	}
	
}
}
