package com.deloitte.labs.lab03.ex02;

import java.util.Scanner;

public class Lab03Ex02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String string = sc.next();
	StringBuilder str = new StringBuilder(string);
	StringBuilder revStr = str.reverse();
	System.out.println(string + "|" + revStr);
	
}
}
