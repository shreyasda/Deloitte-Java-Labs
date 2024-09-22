package com.deloitte.labs.lab01.ex03;

import java.util.Scanner;

public class Lab01Ex03 {
	public static int fibRecursive(int n) {
		if(n <= 1)
			return n;
		else {
			return fibRecursive(n - 1) + fibRecursive(n - 2);
		}
	}
	
	public static int fib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return fibonacci(n, memo);
    }
    
    private static int fibonacci(int n, int[] memo) {
        if (n == 0 || n == 1) {
            memo[n] = n;
            return memo[n];
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The fibonacci digit (using recursion) is " + fibRecursive(number));
		System.out.println("The fibonacci digit (using memoization) is " + fib(number));
		sc.close();
	}
}
