package com.deloitte.labs.lab09.ex01;

import java.util.function.BiFunction;

public class Lab09Ex01 {
	public static void main(String[] args) {
		BiFunction<Double, Double, Double> power = (x, y) -> Math.pow(x, y);
        double base = 2;
        double exponent = 3;
        double result = power.apply(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    
	}
}
