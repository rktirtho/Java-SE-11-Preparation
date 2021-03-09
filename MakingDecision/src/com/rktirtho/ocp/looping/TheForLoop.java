package com.rktirtho.ocp.looping;

import java.util.Iterator;

public class TheForLoop {

	/*
	 * There are two types of for loops in java: for and for each
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// code will execute as a infinite loop
//		for (;;)
//			System.out.println();

		//
		int x = 0;
		
		// any number of same type variable can be declared in initialization part
		// different type of variable cause for compilation error
		for (long y = 0, z = 4, a=20, b=20, d=38; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x + " ");
		
		for (long y = 0, z = 4, a=20, b=20, d=38; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x + " ");

	}

}
