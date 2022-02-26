package com.demo.generics;

public class MaxMain {
	public static void main(String[] args) {
		System.out.println("Welcome to check max of three variables");
		String x = "apple", y = "banana", z = "chikoo", m = "dates";
		Integer a = 25, b = 24, c = 23;
		Float p = 1.23f, q = 2.2f, r = 0.2f;
		FindMaxValue.<String>testMaximum(x, y, z, m);
		FindMaxValue.<Integer>testMaximum(a, b, c);
		FindMaxValue.<Float>testMaximum(p, q, r);
	}
}
