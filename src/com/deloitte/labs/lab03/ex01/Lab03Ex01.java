package com.deloitte.labs.lab03.ex01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab03Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken(); 
            int number = Integer.parseInt(token); 
            System.out.println(number); 
            sum += number;
        }
		System.out.println("Sum of all the elements is "+sum);
	}
}
