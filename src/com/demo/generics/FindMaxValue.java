package com.demo.generics;

public class FindMaxValue {
	int x, y, z;

	// constructor
	public FindMaxValue(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three integers
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;// taking x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("the max %s \n", max);
	}
}
