package com.rktirtho.ocp.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TheArrayList {
	public static void main(String[] args) {
		// This code will not compile
//		var string = new ArrayList<String>();
//		string.add(38);
//		string.add("");
		// this will compile
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("s");
		strings.add("a");
		strings.add("s");
		

		System.out.println(strings.getClass());

		Object[] arr = strings.toArray();
		String[] newArr = strings.toArray(new String[0]);
		System.out.println(Arrays.toString(newArr));

//		for (String string : strings) {
//			
//		}
		int wrapper = Integer.valueOf("123");
		System.out.println(wrapper);
		String[] ms = { "d" };

		String[] s1 = { "Camel", "Peacock", "Llama" };
		String[] s2 = { "Camel", "Llama", "Peacock" };
		int[][] java = new int[3][];

		String f = "e";
		f += false;

		String z1 = "Hello World";
		String z2 = " Hello World".trim().intern();
		System.out.println("============================");
		System.out.println("Z1 and Z2 equality " + (z1 == z2));
		int [] nums = new int[] {2,0,0};
		System.out.println(nums[2]);
		int[] nums2 = new int[] {2,0,0};
		
		System.out.println(nums.equals(nums2));

//		var list = new ArrayList<>();
//		list.add("a");
//		for (String s: list) { } // DOES NOT COMPILE
//		

	}

}
