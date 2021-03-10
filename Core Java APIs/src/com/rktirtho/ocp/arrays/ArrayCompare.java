package com.rktirtho.ocp.arrays;

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {
		int a[] = {1, 2,3};
		int b[] = {1,3,2};
		System.out.println(Arrays.compare(a, b));
		String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		System.out.println(rectangle[0][1]);
	}

}
